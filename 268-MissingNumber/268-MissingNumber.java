// Last updated: 8/18/2026, 9:19:01 AM
class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
         int expsum = n*(n+1)/2;
        //  actual sum 
        int sum = 0;
         for(int i = 0;i<nums.length; i++){
            sum+= nums[i];
         }
         int missing = expsum - sum;
         return missing;
    }
}