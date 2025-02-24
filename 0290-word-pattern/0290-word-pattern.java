class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> hm = new HashMap<>();
        HashMap <String, Character> revMap = new HashMap<>();
        String[] words = s.split(" ");
        char[] chars = pattern.toCharArray();
        if(words.length != chars.length) return false;
        for(int i = 0; i < chars.length; i++){
            // if(hm.containsKey(chars[i])){
            //     if(!hm.get(chars[i]).equals(words[i])){
            //         return false;
            //     }
            // }
            // else{
            //     if(revMap.containsKey(words[i])){
            //         return false;
            //     }
            //     hm.put(chars[i], words[i]);
            //     revMap.put(words[i], chars[i]);
            // }  
            if(hm.containsKey(chars[i]) && !hm.get(chars[i]).equals(words[i])){
                return false;
            }
            if(revMap.containsKey(words[i]) && revMap.get(words[i]) != chars[i]){
                return false;
            }
            hm.put(chars[i], words[i]);
            revMap.put(words[i], chars[i]);
        }
        return true;
    }
}