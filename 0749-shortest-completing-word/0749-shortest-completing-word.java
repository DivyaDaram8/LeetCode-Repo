class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] licenseMap = new int[26];

        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                licenseMap[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String res = "";
        int minLen = Integer.MAX_VALUE;

        for (String word : words) {
            int[] wordMap = new int[26];
            for (char ch : word.toCharArray()) {
                wordMap[ch - 'a']++;
            }

            if (isValid(wordMap, licenseMap) && word.length() < minLen) {
                res = word;
                minLen = word.length();
            }
        }
        return res;
    }

    private boolean isValid(int[] wordMap, int[] licenseMap) {
        for (int i = 0; i < 26; i++) {
            if (wordMap[i] < licenseMap[i]) {
                return false;
            }
        }
        return true;
    }
}
