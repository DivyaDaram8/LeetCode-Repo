
class Solution {
    public int firstUniqChar(String s) {
        // Map<Character, Integer> freqMap = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        // }

        // for (int i = 0; i < s.length(); ++i) {
        //     if (freqMap.get(s.charAt(i)) == 1) {
        //         return i;
        //     }
        // }

        // return -1;
        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
            queue.add(ch);
            while(!queue.isEmpty() && freq[queue.peek() - 'a'] > 1){
                queue.remove();
            }
        }
        return queue.isEmpty() ? -1 : s.indexOf(queue.peek());
    }
}