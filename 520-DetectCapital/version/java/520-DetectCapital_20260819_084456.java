// Last updated: 8/19/2026, 8:44:56 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder cleanString = new StringBuilder();
4        
5        for (int i = 0; i < s.length(); i++) {
6            char c = s.charAt(i);
7            if (Character.isLetterOrDigit(c)) {
8                cleanString.append(Character.toLowerCase(c));
9            }
10        }
11        
12        String original = cleanString.toString();
13        String reversed = cleanString.reverse().toString();
14        
15        return original.equals(reversed);
16    }
17}