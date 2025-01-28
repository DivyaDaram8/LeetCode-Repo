class Solution {
    public int possibleStringCount(String word) {
        int count = 0;
        int prevChar = '0';
        for(char ch : word.toCharArray()){
            if(prevChar == ch){
                count++;
            }
            prevChar = ch;
        }
        return count + 1;
    }
}