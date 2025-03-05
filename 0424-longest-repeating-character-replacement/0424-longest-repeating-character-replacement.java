class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int begin = 0;
        int ans = 0;
        int n = s.length();
        int[] arr = new int[26];
        for(int end = 0; end < n; end++){
            arr[s.charAt(end) - 'A']++;
            max = Math.max(max, arr[s.charAt(end) - 'A']);
            if(end - begin + 1 - max > k){
                arr[s.charAt(begin) - 'A']--;
                begin++;
            }
            ans = Math.max(ans, end - begin + 1);
        }
        return ans;
    }
}