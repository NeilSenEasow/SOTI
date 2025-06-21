public class Solution {
    public int solve(int[] A) {
        int max = A[0];
        int count = 1;
        for(int i=1 ; i<A.length ; i++) {
            if(A[i] > max)   {
                max = A[i];
                count++;
            }
        }
        return count;
    }
}