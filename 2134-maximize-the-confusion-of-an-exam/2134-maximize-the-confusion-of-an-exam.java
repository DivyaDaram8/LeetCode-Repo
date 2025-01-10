class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
       int start = 0;
       int ans = 0;
       int cntT = 0;
       int cntF = 0;
       for(int end = 0; end < answerKey.length(); end++){
            if(answerKey.charAt(end) == 'T'){
                cntT++;
            }
            else{
                cntF++;
            }
            while(Math.min(cntT, cntF) > k){
                if(answerKey.charAt(start) == 'T'){
                    cntT--;
                }
                else{
                    cntF--;
                }
                start++;
            }
            ans = Math.max(ans, end - start + 1);
       }
       return ans;
    }
}