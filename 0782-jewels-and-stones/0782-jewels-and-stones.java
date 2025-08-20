class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hmStones = new HashMap<>();
        for(char ch : stones.toCharArray()){
            hmStones.put(ch, hmStones.getOrDefault(ch, 0) + 1);
        }
        int cnt = 0;
        for(char ch : jewels.toCharArray()){
            if(hmStones.containsKey(ch)){
                cnt += hmStones.get(ch);
            }
        }
        return cnt;
    }
}