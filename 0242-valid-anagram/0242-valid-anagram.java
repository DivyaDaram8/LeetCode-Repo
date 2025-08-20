class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] sht = new int[26];
        int[] tht = new int[26];

        for(char ch : s.toCharArray()){
            sht[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            tht[ch - 'a']++;
        }
        for(char ch : s.toCharArray()){
            if(sht[ch - 'a'] != tht[ch - 'a']){
                return false;
            }
        }
        return true;
    }
}