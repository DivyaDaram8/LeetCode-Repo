class Solution {
    public boolean isAnagram (HashMap<Character, Integer> hms, HashMap<Character, Integer> hmp){
        if(hms.size() != hmp.size()){
            return false;
        }
        for(char key : hmp.keySet()){
            if(!hms.containsKey(key)){
                return false;
            }
            int s = hms.get(key);
            int p = hmp.get(key);
            if(s != p){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> hmp = new HashMap<>();
        HashMap<Character, Integer> hms = new HashMap<>();
        int lenS = s.length();
        int lenP = p.length();
        for(int i = 0; i < lenP; i++){
            char ch = p.charAt(i);
            hmp.put(ch, hmp.getOrDefault(ch,0)+1);
        }
        int start = 0;
        List < Integer> res = new ArrayList<>();
        for(int end = 0; end < lenS; end++){
            char ch = s.charAt(end);
            hms.put(ch,hms.getOrDefault(ch,0)+1);
            if(end - start == lenP){
                char chS = s.charAt(start);
                hms.put(chS,hms.get(chS) - 1);
                if(hms.get(chS) == 0){
                    hms.remove(chS);
                }
                start++;
            }

            if(end - start + 1 == lenP){
                boolean valid = isAnagram(hms,hmp);
                if(valid){
                    res.add(start);
                }
            }
        }
        return res;
    }
}