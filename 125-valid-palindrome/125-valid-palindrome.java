class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        
        while(l<r) {
            if(Character.isLetterOrDigit(s.charAt(l)) && 
                        Character.isLetterOrDigit(s.charAt(r))) {
                if(Character.toLowerCase(s.charAt(l)) != 
                        Character.toLowerCase(s.charAt(r))) return false;
                l++;
                r--;
            } else {
                if(!Character.isLetterOrDigit(s.charAt(l))) l++;
                if(!Character.isLetterOrDigit(s.charAt(r))) r--;
            }
        }
        return true;
    }
}