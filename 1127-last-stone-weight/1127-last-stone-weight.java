class Solution {
    public int lastStoneWeight(int[] stones) {
        // Arrays.sort(stones);
        // for(int i = stones.length - 1; i >= 1; i--){
        //     stones[i - 1] = stones[i] - stones[i - 1];
        //     Arrays.sort(stones,0, i);
        // }
        // return stones[0];


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone: stones)
            maxHeap.add(stone);
        while(maxHeap.size() > 1){
            int ele1 = maxHeap.poll();
            int ele2 = maxHeap.poll();

            if(ele1 != ele2){
                maxHeap.add(ele1 - ele2);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();

    }
}