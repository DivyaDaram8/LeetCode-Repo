class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> ran = new HashMap<>();
        HashMap <Character, Integer> mag = new HashMap<>();
        for(char ch : ransomNote.toCharArray()){
            ran.put(ch, ran.getOrDefault(ch, 0)+1);
        }
        for(char ch : magazine.toCharArray()){
            mag.put(ch, mag.getOrDefault(ch, 0)+1);
        }
        for(char key : ran.keySet()){
            if(ran.get(key) > mag.getOrDefault(key, 0)){
                return false;
            }
        }
        return true;
    }
}