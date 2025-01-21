class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character, Integer> hms = new HashMap<>();
        HashMap <Character, Integer> hmt = new HashMap<>();
        for(char ch : s.toCharArray()){
            hms.put(ch, hms.getOrDefault(ch,0) + 1);
        }
        for(char ch : t.toCharArray()){
            hmt.put(ch, hmt.getOrDefault(ch,0) + 1);
        }
        for(char key : hms.keySet()){
            if(!hmt.containsKey(key)){
                return false;
            }
            if(!hms.get(key).equals(hmt.get(key))){
                return false;
            }
        }
        return true;
    }
}