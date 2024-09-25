class Solution {
    public boolean isPalindrome(String s) {
        // s = s.toLowerCase();
        // s = s.replaceAll("[^a-z0-9]","");
        // if(s.length() == 0 || s.length() == 1)
        //     return true;
        // for(int i = 0; i < s.length(); i++){
        //     char start = s.charAt(i);
        //     char end = s.charAt(s.length() - i - 1);
        //     if(start != end){
        //         return false;
        //     }
        // }
        // return true;
        s = s.toLowerCase();
        if(s.isEmpty())
            return true;
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            char EleAtStart = s.charAt(start);
            char EleAtEnd = s.charAt(end);
            if(!Character.isLetterOrDigit(EleAtStart))
                start++;
            else if(!Character.isLetterOrDigit(EleAtEnd))
                end--;
            else{
                if(s.charAt(start) != s.charAt(end))
                    return false;
                start++;
                end--;            
            }
        }
        return true;
    }
}