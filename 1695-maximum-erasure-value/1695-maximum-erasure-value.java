class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
		//Store number and it's index
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int left=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(nums[i])){
			//Remove complete sum till previous occurance of nums[i] using left pointer. 
                while(left<=map.get(nums[i])){
                    sum-=nums[left];
                    left++;
                }
            }
            map.put(nums[i],i);    
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}