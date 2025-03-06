class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        HashMap <Character, Integer> s1Cnt = new HashMap<>();
        HashMap <Character, Integer> s2Cnt = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            s1Cnt.put(s1.charAt(i), s1Cnt.getOrDefault(s1.charAt(i), 0) + 1);
            s2Cnt.put(s2.charAt(i), s2Cnt.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if(s1Cnt.equals(s2Cnt)){
            return true;
        }
        int left = 0;
        for(int right = s1.length(); right < s2.length(); right++){
            char charLeft = s2.charAt(left);
            s2Cnt.put(charLeft, s2Cnt.get(charLeft) - 1);

            char charRight = s2.charAt(right);
            s2Cnt.put(charRight, s2Cnt.getOrDefault(charRight, 0) + 1);

            if(s2Cnt.get(charLeft) == 0 ){
                s2Cnt.remove(charLeft);
            }
            left++;
            if(s1Cnt.equals(s2Cnt)){
                return true;
            }
        }
        return false;
    }
}