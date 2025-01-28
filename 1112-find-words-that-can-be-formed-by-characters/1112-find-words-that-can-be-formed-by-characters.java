class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap <Character, Integer> hm = new HashMap<>();
        int cnt = 0;
        for(char ch : chars.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) +1);
        }
        for(int i = 0; i < words.length; i++){
            String w = words[i];
            HashMap <Character, Integer> hm2 = new HashMap<>();
            boolean contains = true;

            for(int j = 0; j < w.length(); j++){
                char ch = w.charAt(j);
                hm2.put(ch, hm2.getOrDefault(ch, 0)+1);
            }

            for(char key : hm2.keySet()){
                if(hm2.get(key) > hm.getOrDefault(key, 0)){
                   contains = false;
                   break;
                }
            }
            if(contains){
                cnt += w.length();
            }
        }
        return cnt;
    }
}