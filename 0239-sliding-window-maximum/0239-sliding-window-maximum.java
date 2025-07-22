// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int[] res = new int[nums.length - k + 1];
//         for(int end = 0; end < nums.length - k + 1; end++){
//             res[end] = maxInRange(nums, end, end + k);
//         }
//         return res;
//     }
//     public int maxInRange(int[] nums, int start, int end){
//         int max = Integer.MIN_VALUE;
//         for(int i = start; i < end; i++){
//             max = Math.max(max, nums[i]);
//         }
//         return max;
//     }
// }

// class Solution{
//     public int[] maxSlidingWindow(int[] nums, int k){
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//         int[] res = new int[nums.length - k + 1];
//         int start = 0;
//         for(int end = 0; end < nums.length; end++){
//             maxHeap.add(nums[end]);
//             if(end - start == k){
//                 maxHeap.remove(nums[start]);
//                 start++;
//             }
//             if(end - start + 1 == k){
//                 res[start] = maxHeap.peek();
//             }
//         }
//         return res;
//     }
// }

class Solution{
    public int[] maxSlidingWindow(int[] nums, int k){
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < nums.length; i++){
            if(!deque.isEmpty() && deque.peekFirst() <= i - k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            
            if(i >= k - 1){
                ans[idx] = nums[deque.peekFirst()];
                idx++;
            }
        }
        return ans;
    }
}