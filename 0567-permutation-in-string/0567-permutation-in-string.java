// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if(s1.length() > s2.length()){
//             return false;
//         }
//         HashMap <Character, Integer> s1Cnt = new HashMap<>();
//         HashMap <Character, Integer> s2Cnt = new HashMap<>();
//         for(int i = 0; i < s1.length(); i++){
//             s1Cnt.put(s1.charAt(i), s1Cnt.getOrDefault(s1.charAt(i), 0) + 1);
//             s2Cnt.put(s2.charAt(i), s2Cnt.getOrDefault(s2.charAt(i), 0) + 1);
//         }
//         if(s1Cnt.equals(s2Cnt)){
//             return true;
//         }
//         int left = 0;
//         for(int right = s1.length(); right < s2.length(); right++){
//             char charLeft = s2.charAt(left);
//             s2Cnt.put(charLeft, s2Cnt.get(charLeft) - 1);

//             char charRight = s2.charAt(right);
//             s2Cnt.put(charRight, s2Cnt.getOrDefault(charRight, 0) + 1);

//             if(s2Cnt.get(charLeft) == 0 ){
//                 s2Cnt.remove(charLeft);
//             }
//             left++;
//             if(s1Cnt.equals(s2Cnt)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean checkInclusion(String s1, String s2){
        if(s2.length() < s1.length()){
            return false;
        }
        HashMap<Character, Integer> hmS1 = new HashMap<>();
        HashMap<Character, Integer> hmS2 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            hmS1.put(s1.charAt(i), hmS1.getOrDefault(s1.charAt(i), 0) + 1);
            hmS2.put(s2.charAt(i), hmS2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if(hmS1.equals(hmS2)){
            return true;
        }
        int left = 0;
        for(int right = s1.length(); right < s2.length(); right++){
            char leftCh = s2.charAt(left);
            hmS2.put(leftCh, hmS2.get(leftCh) - 1);
            left++;

            char rightCh = s2.charAt(right);
            hmS2.put(rightCh, hmS2.getOrDefault(rightCh, 0) + 1);

            if(hmS2.get(leftCh) == 0){
                hmS2.remove(leftCh);
            }


            if(hmS1.equals(hmS2)){
                return true;
            }

        }
        return false;
    }
}