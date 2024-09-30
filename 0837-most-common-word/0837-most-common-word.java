// class Solution {
//     public String mostCommonWord(String paragraph, String[] banned) {
//         String str = paragraph.toLowerCase().replaceAll("[^a-z]"," ");
//         String[] strArr = str.split("\\s+");
//         Map<String, Integer> mp = new HashMap<>();
//         for(String word : strArr){
//             if(word.length() > 0){
//            mp.put(word,mp.getOrDefault(word,0)+1); 
//             }
//         }
//         for(String ban : banned){
//             if(mp.containsKey(ban))
//                 mp.remove(ban);
//         }
//         String ans = "";
//         int max = 0;
//         for(String word : mp.keySet()){
//             int count = mp.get(word);
//             if(count > max){
//                 max = count;
//                 ans = word;
//             }
//         }
//         return ans;

//     }
// }
class Solution {
    public String mostCommonWord(String paragraph, String[] ban) {
        HashMap<String, Integer> mp = new HashMap<>();
        Set<String> st = new HashSet<>(Arrays.asList(ban));

        for(String i : paragraph.toLowerCase().replaceAll("[^a-z]"," ").split("\\s+")){
            if(!st.contains(i))
                mp.put(i, mp.getOrDefault(i,0)+1);
        }

        int max = Integer.MIN_VALUE;
        String res = "";
        for(String word : mp.keySet()){
            if(mp.get(word) > max){
                max = mp.get(word);
                res = word;
            }
        } 
        return res;
    }
}