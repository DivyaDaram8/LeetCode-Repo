class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
        }
        int size = pq.size();
        int[] res = new int[size];
        for(int i = 0; i < size; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}