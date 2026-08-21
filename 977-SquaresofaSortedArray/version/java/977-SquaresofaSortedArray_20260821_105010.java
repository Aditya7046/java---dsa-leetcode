// Last updated: 8/21/2026, 10:50:10 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int l =0;
5        int r = n-1;
6        int  ans[] = new int[n];
7        int update = n-1;
8
9        while (l <= r){
10            int lv = nums[l]* nums[l];
11            int rv = nums[r]* nums[r];
12            if (lv >rv){
13                ans[update] = lv;
14                l++;
15            }
16            else {
17                ans[update] = rv;
18                r--;
19            }
20            update--;
21            
22        }
23        return ans;
24
25    }
26    
27}