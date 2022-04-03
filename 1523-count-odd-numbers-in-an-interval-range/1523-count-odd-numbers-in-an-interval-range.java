class Solution {
    public int countOdds(int low, int high) {
        int count=(high-low)/2;
      if(high%2!=0||low%2!=0)
      {
          count++;
      }
        return count;
    }
}