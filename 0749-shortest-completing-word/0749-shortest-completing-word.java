class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character,Integer> licenseMap = new HashMap<>();
        licensePlate = licensePlate.toLowerCase();
        for(char ch : licensePlate.toCharArray()){
            if(Character.isLetter(ch)){
                licenseMap.put(ch, licenseMap.getOrDefault(ch,0) + 1);
            }
        }
        String res = "";
        for(String word : words){
            Map<Character, Integer> wordMap = new HashMap<>();
            
            for(char ch : word.toCharArray()){
                wordMap.put(ch, wordMap.getOrDefault(ch,0) + 1);
            }

            boolean isValid = true;
            for(char ch : licenseMap.keySet()){
                if((wordMap.getOrDefault(ch, 0) < licenseMap.get(ch))){
                    isValid = false;
                    break;
                }
            }


            if(isValid){
                if (res.equals("") || word.length() < res.length()) {
                    res = word;
                }
            } 
        }
        return res;
    }
}