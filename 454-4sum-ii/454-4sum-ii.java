class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        HashMap <Integer,Integer> map =new HashMap<>();
        int n=nums1.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=nums1[i]+nums2[j];
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }
                else
                    map.put(sum,1);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=nums3[i]+nums4[j];
                if(map.containsKey(-sum) ){
                    ans+=map.get(-sum);
                }
            }   
        }
        return ans;
    }
}
