public class Solution {
    public ArrayList<Integer> flip(String A) {
	int n = A.length();
	int currentsum = 0;
	int maxsum = 0;
	int left = -1;
	int right = -1;
	int start = 0;
	for(int i=0 ; i<n ; i++)	{
		int val = (A.charAt(i) == '0') ? 1 : -1;
        currentsum += val;

		if(currentsum > maxsum)		{
			maxsum = currentsum;
			left = start;
                	right = i;

		}	
		if(currentsum < 0)	{
			currentsum = 0;
			start = i+1;
		}
	  }
	  ArrayList<Integer> result = new ArrayList<>();
          if (left != -1) {
           	result.add(left + 1);
          	result.add(right + 1);
          }
          return result;
     }
}