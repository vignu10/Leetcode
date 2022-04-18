class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int count=0,max=0,last=-1;
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)>last)
            {
                max=Math.max(count,max);
                last=map.get(c);
                // System.out.print(last);
                count=i-last;
            }
            else
            {
                count++;
            }
            map.put(c,i);
        }
        return Math.max(count,max);
    }
}