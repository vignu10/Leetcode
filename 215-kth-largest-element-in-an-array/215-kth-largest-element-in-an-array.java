class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>();
        for(int i : nums)
        {
            max.add(i);
            if(max.size() > k) max.poll();
        }
        return max.peek();
    }
}