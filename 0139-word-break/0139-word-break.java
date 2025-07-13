//  class TrieNode{
//     TrieNode[] children = new TrieNode[26];
//     boolean isEoW = false;
// }
// class Solution{
//     TrieNode root = new TrieNode();
    
//     public void insert(String word){
//         TrieNode curr = root;
//         for(char ch : word.toCharArray()){
//             int idx = ch - 'a';
//             if(curr.children[idx] == null){
//                 curr.children[idx] = new TrieNode();
//             }
//             curr = curr.children[idx];
//         }
//         curr.isEoW = true;
//     }

//     public boolean search(String s){
//         TrieNode curr = root;
//         for(int i = 0; i < s.length(); i++){
//             int idx = s.charAt(i) - 'a';
//             if(curr.children[idx] == null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.isEoW;
//     }
//     public boolean isValid(String s){
//         if(s.length() == 0){
//             return true;
//         }
//         for(int i = 1; i <= s.length(); i++){
//             if(search(s.substring(0, i)) && isValid(s.substring(i))){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public boolean wordBreak(String s, List<String> wordDict){
//         for(String str : wordDict){
//             insert(str);
//         }
//         return isValid(s);
//     }
// }


class Solution{
    public boolean wordBreak(String s, List<String> wordDict){
        Set<String> dict = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && dict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}