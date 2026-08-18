// Last updated: 8/18/2026, 9:19:03 AM
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanString = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleanString.append(Character.toLowerCase(c));
            }
        }
        
        String original = cleanString.toString();
        String reversed = cleanString.reverse().toString();
        
        return original.equals(reversed);
    }
}