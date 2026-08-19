// Last updated: 8/19/2026, 8:33:49 AM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3       
4
5 
6    return word.equals(word.toUpperCase()) || 
7           word.equals(word.toLowerCase()) || 
8           (Character.isUpperCase(word.charAt(0)) && 
9            word.substring(1).equals(word.substring(1).toLowerCase()));
10}
11}