class Solution {
    public int[] sortEvenOdd(int[] nums) {
      
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        int index=0;
        for (int i = 0; i < nums.length; i+=2) {
            arr1.add(nums[i]);
        }
        for (int i = 1; i < nums.length; i+=2) {
            arr2.add(nums[i]);
        }
        Collections.sort(arr2,Collections.reverseOrder());
        Collections.sort(arr1);
        boolean b=false;
        for (int i = 0; i <nums.length ; i++) {
            if(!b){
                nums[i]=arr1.get(index);
                System.out.print(nums[i]);
                b=true;
            }else{
                nums[i]=arr2.get(index);
                b=false;
                index++;
            }
        }
        return nums;
    }
}