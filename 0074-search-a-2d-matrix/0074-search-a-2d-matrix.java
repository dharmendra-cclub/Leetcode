class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Optimal approach
        int l1 = 0, l2 =  0;
        int n = matrix.length;
        int m = matrix[0].length;
        int u1 = n-1, u2 = m - 1;

        while(l1 <= u1 && l2 <= u2)
        {
            int mid1 = (l1+u1)/2;
            int mid2 = (l2+u2)/2;

            if(target == matrix[mid1][mid2])
                return true;
            if(target < matrix[mid1][mid2])
            {
                if(mid2 == 0)
                {
                    u1 = mid1 - 1;
                    u2 = m - 1;
                }
                else
                    u2 = mid2 - 1;
            }
            else
            {
                if(mid2 == m - 1)
                {
                    l1 = mid1 + 1;
                    l2 = 0;
                }
                else
                    l2 = mid2 + 1;
            }
        }

        return false;
    }
}