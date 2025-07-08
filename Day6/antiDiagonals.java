public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // int m = A[0].size();
        //Part 1
        for(int col=0; col<n ; col++) {
            ArrayList<Integer> diagonal = new ArrayList<>();
            int i=0 , j=col;
            while(i<n && j>=0)  {
                diagonal.add(A.get(i).get(j));
                i++;
                j--;
            }
            result.add(diagonal);
        }
        
        //Part 2
        for(int row=1 ; row<n ; row++)    {
            ArrayList<Integer> diagonal = new ArrayList<>();
            int i=row , j=n-1;
            while(i<n && j>=0)  {
                diagonal.add(A.get(i).get(j));
                i++;
                j--;
            }
            result.add(diagonal);
        }
        return result;
    }
}
