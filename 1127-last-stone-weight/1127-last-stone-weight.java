class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        for(int i = stones.length - 1; i >= 1; i--){
            stones[i - 1] = stones[i] - stones[i - 1];
            Arrays.sort(stones,0, i);
        }
        return stones[0];
    }
}