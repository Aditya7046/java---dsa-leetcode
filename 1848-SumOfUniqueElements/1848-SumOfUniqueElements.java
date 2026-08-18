// Last updated: 8/18/2026, 9:18:48 AM
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        
        for (int num : nums) {
            count[num]++;
        }
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (count[currentNum] == 1) {
                sum += currentNum;
            }
        }
        
        return sum;
    }
}