class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int[] arr = new int[58];
        char[] jewelsArr = jewels.toCharArray();
        for(char ch: jewelsArr){
            arr[ch - 'A'] = 1;
        }
        for(char ch: stones.toCharArray()){
            count+=arr[ch - 'A'];
        }
        return count;
        // HashSet<Character> jewelSet = new HashSet<>();
        // int count = 0;
        // for(char ch: jewels.toCharArray()){
        //     jewelSet.add(ch);
        // }
        // for(char ch: stones.toCharArray()){
        //     if(jewelSet.contains(ch))
        //         count++;
        // }
        // return count;
    }
}