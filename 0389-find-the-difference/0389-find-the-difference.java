class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;
        for(char ch : s.toCharArray()){
            sumS += (int) ch;
        }
        for(char ch : t.toCharArray()){
            sumT += (int) ch;
        }
        return (char) (sumT - sumS); 
    }
}