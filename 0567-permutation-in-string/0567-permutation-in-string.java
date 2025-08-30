class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];

        for(char ch : s1.toCharArray()){
            freqS1[ch - 'a']++;
        }

        int windowSize = s1.length();

        for(int i = 0; i < s2.length(); i++){
            freqS2[s2.charAt(i) - 'a']++;
            if(i >= windowSize){
                freqS2[s2.charAt(i - windowSize) - 'a']--;
            }
            if(Arrays.equals(freqS1, freqS2)){
                return true;
            }
        }
        return false;
    }
}
