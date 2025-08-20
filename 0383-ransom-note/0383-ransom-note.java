class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            mag.put(ch, mag.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> rn = new HashMap<>();
        for(char ch : ransomNote.toCharArray()){
            rn.put(ch, rn.getOrDefault(ch, 0) + 1);
            if(!mag.containsKey(ch) || rn.get(ch) > mag.get(ch)){
                return false;
            }
        }
        return true;
    }
}