class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rows = 0, cols = m-1;

        while(rows >= 0 && rows < n && cols >= 0 && cols < m)
        {
            if(target == matrix[rows][cols])
                return true;
            if(target >= matrix[rows][0] && target < matrix[rows][cols])
                cols = cols - 1;
            else
                rows = rows + 1;
        }

        return false;
    }
}