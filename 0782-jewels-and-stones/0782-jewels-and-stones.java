class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] arr = new int[58];
        char[] jewelsArr = jewels.toCharArray();
        char[] stoneArr = stones.toCharArray();
        for(char ch: jewelsArr){
            arr[ch - 'A'] = 1;
        }
        for(char ch: stoneArr){
            count+=arr[ch - 'A'];
        }
        return count;
    }
}