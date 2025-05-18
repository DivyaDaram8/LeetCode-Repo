class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num: nums){
            hs.put(num, hs.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : hs.entrySet()){
            pq.add(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}