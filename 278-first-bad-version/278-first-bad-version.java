/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=0,high=n;
        while(high>low)
        {
            int pivot=low+(high-low)/2;
            if(isBadVersion(pivot))
            {
               high=pivot;
            }
            else
                low=pivot+1;
        }
        return low;
    }
}