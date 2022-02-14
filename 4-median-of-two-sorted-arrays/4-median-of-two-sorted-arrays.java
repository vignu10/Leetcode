class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        int i=0;
        int j=0;
        int index=0;
        int sorted[]=new int[len];
        while(i<nums1.length&&j<nums2.length){
        if(nums1[i]<nums2[j])
        {
            sorted[index++]=nums1[i++];
        }
            else
            {
                sorted[index++]=nums2[j++];
            }
        
        }
        while(i<nums1.length)
        {
          sorted[index++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            sorted[index++]=nums2[j++];
        }
        double res=0;
        if(sorted.length % 2 == 0){
        res = (double) (sorted[sorted.length / 2] + sorted[(sorted.length / 2) - 1])/2;   
    } else {
        res = (double) sorted[sorted.length / 2];
    } 
    return res;
    }
}