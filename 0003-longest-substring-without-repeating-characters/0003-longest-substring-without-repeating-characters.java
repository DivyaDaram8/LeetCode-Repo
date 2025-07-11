// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashSet <Character> hs = new HashSet<>(); 
//         int ans = 0;
//         int start = 0;
//         for(int end = 0; end < s.length(); end++){
//             char ch = s.charAt(end);
//             if(!hs.contains(ch)){
//                 hs.add(ch);
//             }
//             else{
//                 while(hs.contains(ch)){
//                     hs.remove(s.charAt(start));
//                     start++;
//                 }
//                 hs.add(s.charAt(end));
//             }
//             ans = Math.max(ans, end - start + 1);
//         }
//         return ans;
//     }
// }

class Solution{
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
            }else{
                while(hs.contains(s.charAt(end))){
                    hs.remove(s.charAt(start));
                    start++;
                }
                hs.add(s.charAt(end));
            }
            ans = Math.max(ans, end - start + 1);
            end++;
        }
        return ans;
    }
}