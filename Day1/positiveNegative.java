public class Solution {
    public int[] solve(int[] A) {
        int pcount = 0;
        int ncount = 0;
        for(int i=0 ; i<A.length ; i++) {
            if(A[i] > 0)    { pcount++;}
            else if(A[i] < 0)   {ncount++;}
        }
        return new int[]{pcount,ncount};
    }
}
