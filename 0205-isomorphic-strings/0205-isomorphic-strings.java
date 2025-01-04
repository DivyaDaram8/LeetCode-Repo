class Solution {
    public boolean isIsomorphic(String s, String t) {
        boolean isIso = false;
        HashMap <Character, Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!hm.containsKey(s.charAt(i)) && !hm.containsValue(t.charAt(i)))
            {
                // if( hm.get(s.charAt(i)) != t.charAt(i)))
                hm.put(s.charAt(i),t.charAt(i));
                isIso = true;
            }
            else if(hm.containsKey(s.charAt(i)) == true && hm.get(s.charAt(i)) == t.charAt(i)){
                isIso = true;
            }
            else{
                isIso = false;
                return isIso;
            }
        }
        return true;
    }
}