class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxTemp = arr[n-1];
        int temp;
        arr[n-1] = -1;
        for(int i = n -2; i >= 0; i--){
            temp = arr[i];
            arr[i] = maxTemp;
            maxTemp = Math.max(temp,arr[i]);
        }
        return arr;
    }
}