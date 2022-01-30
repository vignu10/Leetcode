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