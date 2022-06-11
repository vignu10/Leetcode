class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num: nums){
            sum+=num;
        }
        sum -= x; // ****totalsum-target to find maxSubArray 
        int left = 0,right = 0,ans = -1;
        int subArraySum = 0;
        while(right<nums.length){
            subArraySum+=nums[right];
            if(subArraySum>sum){
                while(subArraySum>sum && left<=right){
                    subArraySum-=nums[left++];
                }
            }
            if(subArraySum==sum){
                ans = Math.max(ans,right-left+1);
            }
            right++;
        }
        return ans==-1?ans:nums.length-ans;
    }
}