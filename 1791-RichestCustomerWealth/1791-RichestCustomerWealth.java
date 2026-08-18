// Last updated: 8/18/2026, 9:18:51 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxhealth = 0;
        for (int i = 0; i < accounts.length; i++){
            int sum = 0;
            for (int j = 0; j <accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if (sum > maxhealth) {
                maxhealth = sum;
            }
        }
        return maxhealth;
    }
}