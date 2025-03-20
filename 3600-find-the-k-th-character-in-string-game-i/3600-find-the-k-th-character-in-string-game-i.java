class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while(sb.length() < k){
            // if(sb.length() > k) return sb.charAt(k);
            String word = sb.toString();
            for(char ch : word.toCharArray()){
                if(ch == 'z') sb.append('a');
                else{
                    sb.append((char) (ch + 1));
                }
                if(sb.length() >= k){
                    return sb.charAt(k - 1);
                }
            }   
        }
        return 'a';
    }
}