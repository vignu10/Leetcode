// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

 

// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]


class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        int i=0;
        reverse(s, i, n);
    }
    private static void reverse(char[] s, int i , int n){
        if(i<n){
            char temp = s[n];
            s[n] = s[i];
            s[i] = temp;
            reverse(s, i+1, n-1);
        }
    }
}
