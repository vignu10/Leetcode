class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {

  // create new array
  int[] newArr = new int[m];
    
    //copy from nums1 into new array
    for( int i=0; i< m;i++)
    {
        newArr[i] = nums1[i];
    }
    

    // maintain pointers in 2 arrays( newArr and nums2 for comparison)
    int j = 0;
    int k = 0;

    // fill in the nums1 by making compares in newArr and nums2
	
    for (int i = 0; i < m+n; i++) {
	
			// all cases =>  newArr is not exhausted and make compare or nums2 is exhausted

        if (j != m && (k == n || newArr[j] < nums2[k])) {

            nums1[i] = newArr[j];
            j++;

        }
        else {
            nums1[i] = nums2[k];
            k++;
        }


    }
    
 



    
}
}