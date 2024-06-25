class Solution {
    public int findMaxElement(int[][] arr, int col)
    {
        int max = -1, index = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i][col])
            {
                max = arr[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int l = 0, u = m - 1;
        while(l <= u)
        {
            int mid = (l+u)/2;
            int maxRowIndex = findMaxElement(mat, mid);
            int left = mid - 1 >= 0? mat[maxRowIndex][mid - 1]: -1;
            int right = mid + 1 < m? mat[maxRowIndex][mid + 1]: -1;
            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right)
                return new int[]{maxRowIndex, mid};
            if(mat[maxRowIndex][mid] < left)
                u = mid - 1;
            else
                l = mid + 1;

        }

        return new int[]{-1,-1};
    }
}