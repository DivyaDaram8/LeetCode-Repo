class Solution {
    public String intToRoman(int num) {
        Map<String, Integer> hm = new LinkedHashMap<>();
        hm.put("M", 1000);
        hm.put("CM", 900);
        hm.put("D", 500);
        hm.put("CD", 400);
        hm.put("C", 100);
        hm.put("XC", 90);
        hm.put("L", 50);
        hm.put("XL", 40);
        hm.put("X", 10);
        hm.put("IX", 9);
        hm.put("V", 5);
        hm.put("IV", 4);
        hm.put("I", 1);

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> sets : hm.entrySet()){
            while(num >= sets.getValue()){
                num -= sets.getValue();
                sb.append(sets.getKey());
            }
        }
        return sb.toString();
    }
}