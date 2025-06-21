public class Solution {
    public int[][] solve(int[][] A) {
        int row = A.length;
        int col = A.length;
        for(int i=0 ; i<row ; i++)    {
            for(int j=i+1 ; j<col ; j++)  {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
                // matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
            }
        }
        return A;
    }
}