// Step 1: Reverse the complete array
// i.e ex: [1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]

// Step 2: Reverse back the first division of the array, i.e 0th to k-1th index
// ex: if k=3 [5,6,7] -> [5,6,7,4,3,2,1]

// Step 3: Reverse back the second division of the array, i.e kth to n-1th index
// ex: if k=3 [1,2,3,4] -> [5,6,7,1,2,3,4]



// Given an array, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]







public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1); //reverse complete array
    reverse(nums, 0, k - 1); // reverse back the 1st half
    reverse(nums, k, nums.length - 1); // reverse back the 2nd half

  }

 class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        System.out.print(k);
        reverse(nums, 0, n-1-k);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
    
    private void reverse(int[] nums, int s, int e){
        while(e>s){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
}
