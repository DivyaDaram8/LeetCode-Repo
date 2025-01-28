class Solution {
    public int possibleStringCount(String word) {
        int count = 0;
        int prev = '0';
        for(char ch : word.toCharArray()){
            if(prev == ch){
                count++;
            }
            prev = ch;
        }
        return count + 1;
    }
}