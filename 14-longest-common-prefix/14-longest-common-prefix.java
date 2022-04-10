class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        
        String prefix = strs[0];
        
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){   // checking common prefix in each String 
                prefix = prefix.substring(0, prefix.length() - 1);   // and remove the uncommon characters one by one from last of String
            }
        }
        
        return prefix;
    }
}