class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.isEmpty()) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char S = s.charAt(start);
            char E = s.charAt(end);
            if (!(S >= 97 && S <= 122 || S >= 48 && S <= 57)) {
                start++;
                continue; 
            }
            if (!(E >= 97 && E <= 122 || E >= 48 && E <= 57)) {
                end--;
                continue; 
            }
            if (S != E) {
                return false; 
            }
            start++;
            end--;
        }
        return true;
    }
}
