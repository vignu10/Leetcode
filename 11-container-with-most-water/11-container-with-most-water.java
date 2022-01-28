class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i =0 ;
        int j =n-1;
        int ans = Integer.MIN_VALUE;
        while(i<j){
            int cA = Math.min(height[i],height[j])*(j-i);
            ans=Math.max(cA,ans);
            
           if (height[i]<height[j])
               i+=1;
            else
                j-=1;
                
            
        }
        return ans;
        
    }
}