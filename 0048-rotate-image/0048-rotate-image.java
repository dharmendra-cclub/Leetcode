class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
       for(int j = 0; j < size/2; j++)
       {
        for(int i = 0; i < size-1-2*j; i++)
        {
            int start = matrix[0+j][i+j];
            for(int k = 0; k < 4; k++)
            {
                if(k == 0)
                {
                    int temp = matrix[i+j][size-1-j];
                    matrix[i+j][size-1-j] = start;
                    start = temp;
                }
                else if(k == 1)
                {
                    int temp = matrix[size-1-j][size-1-i-j];
                    matrix[size-1-j][size-1-i-j] = start;
                    start = temp;
                }
                else if(k == 2)
                {
                    int temp = matrix[size-1-i-j][0+j];
                    matrix[size-1-i-j][0+j] = start;
                    start = temp;
                }
                else if(k == 3)
                {
                    int temp = matrix[0+j][i+j];
                    matrix[0+j][i+j] = start;
                    start = temp;
                }
            }
        }
       }
    }
}