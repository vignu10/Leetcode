class Solution {
    public int strStr(String haystack, String needle) {
        int index=0;
        if(needle==null)
        {
            return 0;
        }
        if(haystack.contains(needle))
        {
            index=haystack.indexOf(needle);
        }
        else
        {
            return -1;
        }
        return index;
    }
}