class Solution {
    public void setZeroes(int[][] matrix) {
        // int copyMatrix[][] = matrix.clone();
        int[][] copyMatrix = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copyMatrix[i] = matrix[i].clone();
        }
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                if(copyMatrix[i][j] == 0)
                {
                    for(int x = 0; x < matrix.length; x++)
                    matrix[x][j] = 0;
                    for(int y = 0; y < matrix[i].length; y++)
                    matrix[i][y] = 0;
                }
            }
        }
    }
}