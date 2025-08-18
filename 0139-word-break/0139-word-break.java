class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEoW = false;
}

    class Solution {
        TrieNode root = new TrieNode();

        public void insert(String word){
            TrieNode curr = root;
            for(char ch : word.toCharArray()){
                int idx = ch - 'a';
                if(curr.children[idx] == null){
                    curr.children[idx] = new TrieNode();
                }
                curr = curr.children[idx];
            }
            curr.isEoW = true;
        }
        public boolean search(String s){
            TrieNode curr = root;
            for(int i = 0; i < s.length(); i++){
                int idx = s.charAt(i) - 'a';
                if(curr.children[idx] == null){
                    return false;
                }
                curr = curr.children[idx];
            }
            return curr.isEoW;
        }
    Map<String, Boolean> memo = new HashMap<>();
    public boolean isValid(String s){
        if(s.length() == 0){
            return true;
        }
        if(memo.containsKey(s)){
            return memo.get(s);
        }
        for(int i = 1; i <= s.length(); i++){
            if(search(s.substring(0, i)) && isValid(s.substring(i))){
                memo.put(s, true);
                return true;
            }
        }
        memo.put(s, false);
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for(String str : wordDict){
            insert(str);
        }
        return isValid(s);
    }
}