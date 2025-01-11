class Solution {
    public int totalFruit(int[] fruits) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int start = 0;
        int ans = 0;
        for(int end = 0; end < fruits.length; end++){
            int fruit = fruits[end];
            hm.put(fruit, hm.getOrDefault(fruit, 0) + 1);
            while(hm.size() > 2){
                int startVal = fruits[start];
                hm.put(startVal, hm.get(startVal) - 1);
                if(hm.get(startVal) == 0){
                    hm.remove(startVal);
                }
                start++;
            }
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}