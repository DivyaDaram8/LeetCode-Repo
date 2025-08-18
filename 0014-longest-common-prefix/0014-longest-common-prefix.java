class Solution {
    private class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEoW = false;
    }
    private TrieNode root = new TrieNode();

    private void insert(String word){
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
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        for(String str : strs){
            if(str.isEmpty()){
                return "";
            }
            insert(str);
        }

        StringBuilder lcp = new StringBuilder();
        TrieNode curr = root;

        while(1 == 1){
            int count = 0;
            int index = -1;

            for(int i = 0; i < 26; i++){
                if(curr.children[i] != null){
                    count++;
                    index = i;
                }
            }
            if(count != 1 || curr.isEoW){
                break;
            }
            curr = curr.children[index];
            lcp.append((char) (index + 'a'));

        }
        return lcp.toString();
    }
}