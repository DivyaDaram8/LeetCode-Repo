class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pntr1 = 0;
        int pntr2 = 0;
        int temp =  0;
        while(pntr1 < m && pntr2 < n){
            int ele1 = nums1[pntr1];
            int ele2 = nums2[pntr2];
            if(ele1 > ele2){
                temp = nums1[pntr1];
                nums1[pntr1] = nums2[pntr2];
                nums2[pntr2] = temp;
                
                int k = pntr2;
                while(k + 1 < n && nums2[k] > nums2[k+1]){
                    int temp2 = nums2[k];
                    nums2[k] = nums2[k+1];
                    nums2[k+1] = temp2;
                    k++;
                }
            }
            pntr1++;  
        }
        while(pntr2 < n){
            nums1[pntr1] += nums2[pntr2];
            pntr2++;
            pntr1++;  
        }  
    }
}