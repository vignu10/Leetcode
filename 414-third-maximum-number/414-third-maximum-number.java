class Solution {
    public int thirdMax(int[] nums) {
       int n =0;
        HashSet<Integer> set = new HashSet<>();
        for(int k : nums)
        {
            set.add(k);
        }
        int count=0;
        int arr[] = new int[set.size()];
        for(int k : set)
        {
            arr[count++] = k;
            
        }
        Arrays.sort(arr);
         if(arr.length==2 || arr.length == 1)
        {
            n = arr[arr.length-1];
             return n;
        }
        else
        {
         n = arr[arr.length-3];
        }
        return n;
    }
}