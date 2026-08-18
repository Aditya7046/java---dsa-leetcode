// Last updated: 8/18/2026, 9:18:50 AM
class Solution {
    public String largestOddNumber(String num) {

        for(int i=num.length()-1; i>=0; i--){

            // if odd or even 
            if(num.charAt(i)%2==1){

                return num.substring(0,i+1);
            }
        }
        return "";
    } 
}