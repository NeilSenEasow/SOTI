class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // target : 9, nums = [ 2, 7, 11, 15]

        int left, right, flag = 0;

        for(int i=0 ; i< nums.length ; i++) {
            for(int j=0 ; j<nums.length ; j++)  {
                if(i!=j & target == nums[i] + nums[j])    {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }
}