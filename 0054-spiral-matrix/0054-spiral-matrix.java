class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n_rows = matrix.length;
        int n_cols = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int top = 0, bottom = n_rows-1, left = 0,  right = n_cols-1;
         
        while(left <= right && top <= bottom)
        {
            for(int i = left; i <= right; i++)
            {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++)
            {
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--; 
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}