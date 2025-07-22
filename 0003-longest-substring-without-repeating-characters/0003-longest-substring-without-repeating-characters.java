class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int start = 0;
        int maxLen = 0;
        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            while(hm.containsKey(ch) && hm.get(ch) > 0){
                char leftChar = s.charAt(start);
                hm.put(leftChar, hm.get(leftChar) - 1);
                start++;
            }
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}