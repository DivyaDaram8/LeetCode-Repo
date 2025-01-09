class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int sum = 0;
        int cnt = 0;
        for(int end = 0; end < arr.length; end++){
            sum += arr[end];
            if(end - start == k){
                sum -= arr[start];
                start++;
            }
            if(end - start + 1 == k){
                int avg = sum / k;
                if(avg >= threshold){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}