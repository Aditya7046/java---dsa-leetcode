// Last updated: 8/21/2026, 12:49:11 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int l = 0;
5        int r = n-1;
6        int [] ans = new int[n];
7        int update = n-1;
8        for(int i =n-1; i >=0;i--){
9            if(Math.abs(nums[l]) > Math.abs(nums[r])){
10                ans[i] = nums[l]*nums[l];
11                l++;
12            }
13            else{
14                ans[i] = nums[r]*nums[r];
15                r--;
16            }
17            // i--;
18        }
19        return ans;
20    }
21}