// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet <Integer> hs = new HashSet<>();
//         ArrayList <Integer> unique = new ArrayList<>();
//         int len1 = nums1.length;
//         int len2 = nums2.length;
//         boolean max = len1 > len2 ? true : false;
//         if(max){
//             for(int i = 0; i < len1; i++){
//                 hs.add(nums1[i]);
//             }
//             for(int i = 0; i < len2; i++){
//                 if(hs.contains(nums2[i])){
//                     unique.add(nums2[i]);
//                     hs.remove(nums2[i]);
//                 }
//             }
//         }
//         else{
//             for(int i = 0; i < len2; i++){
//                 hs.add(nums2[i]);
//             }
//              for(int i = 0; i < len1; i++){
//                 if(hs.contains(nums1[i])){
//                     unique.add(nums1[i]);
//                     hs.remove(nums1[i]);
//                 }
//             }
//         }
//         // int[] array = hs.stream().mapToInt(Integer::intValue).toArray();
//         return unique.stream().mapToInt(Integer::intValue).toArray();
//     }
// }
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> unique = new ArrayList<>();

        for (int num : nums1) {
            hs.add(num);
        }

        for (int num : nums2) {
            if (hs.contains(num)) {
                unique.add(num);
                hs.remove(num);
            }
        }

        int[] result = new int[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            result[i] = unique.get(i);
        }

        return result;
    }
}