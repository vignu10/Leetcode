class Solution {
    public int lengthOfLastWord(String s) {
       String[] arr=s.split(" ");
       String str=arr[arr.length-1];
        System.out.print(str);
        int count=0;
        char[] ch=str.toCharArray();
        for(char c:ch){
            count++;
        }
        return count;
    }
}