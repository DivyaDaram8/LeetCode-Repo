class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pntr1 = m - 1;
        int pntr2 = n - 1;
        int lastIndex = m + n - 1;

        while (pntr1 >= 0 && pntr2 >= 0) {
            int ele1 = nums1[pntr1];
            int ele2 = nums2[pntr2];

            if (ele1 > ele2) {
                nums1[lastIndex] = ele1;
                pntr1--;
            } else {
                nums1[lastIndex] = ele2;
                pntr2--;
            }
            lastIndex--;
        }

        // If nums2 still has elements left
        while (pntr2 >= 0) {
            nums1[lastIndex] = nums2[pntr2];
            pntr2--;
            lastIndex--;
        }
    }
}
