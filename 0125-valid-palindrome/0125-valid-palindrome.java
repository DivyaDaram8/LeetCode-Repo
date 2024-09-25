class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        if(s.length() == 0 || s.length() == 1)
            return true;
        for(int i = 0; i < s.length(); i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length() - i - 1);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}