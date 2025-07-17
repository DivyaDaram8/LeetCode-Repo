class Solution{
    public int trap(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        while(left < right){
            leftMax = Math.max(leftMax, arr[left]);
            rightMax = Math.max(rightMax, arr[right]);

            if(leftMax < rightMax){
                ans = ans + leftMax - arr[left];
                left++;
            }else{
                ans = ans + rightMax - arr[right];
                right--;
            }
        }
        return ans;
    }
}