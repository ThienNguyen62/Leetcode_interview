/*
well leetcode warn no use it, just understand 

ma trận phụ*/
 class Solution48_3 {
    public void rotate3 (int [][] matrix)
    {
        int n = matrix.length;
        int [][] res = new int [n][n];
        for ( int i =0;i<n;i++)
        {
            for (int j =0; j<n;i++)
            {
                res[j][n-1-i] = matrix [i][j];
            }
        }
        // copy lại vào matrix gốc
        for ( int i =0; i<n;i++)
        {
            for ( int j =0; j < n; j++)
            {
                matrix [i][j] = res[i][j];
            }
        }
    }
}
