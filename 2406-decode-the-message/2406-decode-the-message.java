class Solution {
    public String decodeMessage(String key, String message) {
        HashMap <Character,Character> hm = new HashMap<>();
        int temp = 97;
        for(int i = 0; i < key.length(); i++){
            char ch = key.charAt(i);
            if(ch != ' ' && !hm.containsKey(ch)){
                hm.put(ch,(char)temp);
                temp++;
            }
        }
        String ans = "";
        char ch;
        for(int i  = 0; i < message.length(); i++){
            ch = message.charAt(i);
            if(ch != ' '){
                char val = hm.get(ch);
                ans += val;
            }
            else{
                ans += ' ';
            }
        }
        return ans;
    }
}