// class Solution {
//     public int[][] merge(int[][] arr) {
//         Arrays.sort(arr, (a, b) -> a[0] - b[0]);
//         List<int[]> ans = new ArrayList<>();

//         int i = 0;
//         int len = arr.length;
//         int start;
//         int end;

//         while(i < len){
//             start = arr[i][0];
//             end = arr[i][1];
//             while(i + 1 < len && end >= arr[i + 1][0]){
//                 end = Math.max(end, arr[i + 1][1]);
//                 i++;
//             }
//             ans.add(new int[]{start, end});
//             i++;
//         }
//         return ans.toArray(new int[ans.size()][]);
//     }
// }

class Solution{
    public int[][] merge(int[][] arr){
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int len = arr.length;
        int i = 0;
        int start, end;
        while(i < len){
            start = arr[i][0];
            end = arr[i][1];
            while(i + 1 < len && end >= arr[i + 1][0]){
                end = Math.max(end, arr[i + 1][1]);
                i++;
            }
            ans.add(new int[]{start, end});
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}