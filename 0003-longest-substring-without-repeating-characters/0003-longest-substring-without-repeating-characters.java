class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int begin = 0;
        int maxLen = 0;
        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            while(hm.containsKey(ch) && hm.get(ch) > 0){
                char left = s.charAt(begin);
                hm.put(left, hm.get(left) - 1);
                begin++;
            }
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxLen = Math.max(maxLen, end - begin + 1);
        }
        return maxLen;
    }
}