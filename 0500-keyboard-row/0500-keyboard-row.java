class Solution {
    public String[] findWords(String[] words) {
        int n = words.length;
        ArrayList<String> list = new ArrayList<>();
        String one = "qwertyuiop";
        String two = "asdfghjkl";
        String three = "zxcvbnm";
        for(String s : words){
            if(checkString(s, one) || checkString(s, two) || checkString(s, three)){
                list.add(s);
            }
        }
        String[] ans = list.toArray(new String[0]);
        return ans;
    }
    public static boolean checkString(String str, String check){
        for(char ch : str.toCharArray()){
            ch = Character.toLowerCase(ch);
            if(check.indexOf(ch) == -1){
                return false;
            }
        }
        return true;
    }
}