class Solution{
    public String minWindow(String s, String t){
        if(s.length() < t.length()){
            return "";
        }
        HashMap<Character, Integer> hmT = new HashMap<>();
        for(char ch : t.toCharArray()){
            hmT.put(ch, hmT.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> hmS = new HashMap<>();
        int cntT = hmT.size();
        int contains = 0;
        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            hmS.put(ch, hmS.getOrDefault(ch, 0) + 1);

            int chs = hmS.getOrDefault(ch, 0);
            int cht = hmT.getOrDefault(ch, 0);

            if(hmT.containsKey(ch) && chs == cht){
                contains++;
            }

            while(contains == cntT){
                if((right - left + 1) < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                char charAtLeft = s.charAt(left);
                hmS.put(charAtLeft, hmS.get(charAtLeft) - 1);
                if(hmT.containsKey(charAtLeft) &&
                     hmS.get(charAtLeft).intValue() < hmT.get(charAtLeft).intValue()){
                        contains--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}