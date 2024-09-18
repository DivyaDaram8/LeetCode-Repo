class Solution {
     public static int nCr(int row, int col){
        long res = 1;
        for(int i = 0; i < col ; i++){
            res = res * (row - i);
            res = res / (i +1);
        }
        return (int) res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Op = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> templist = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                templist.add(nCr(i - 1, j - 1));
            }
            Op.add(templist);
        }
        return Op;
    }
   
}