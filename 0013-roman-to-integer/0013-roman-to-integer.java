class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        
        int idx = s.length() - 1;
        int ans = 0;
        
        while (idx >= 0) {
            char ch = s.charAt(idx);
            if (idx - 1 >= 0) {
                char ch1 = s.charAt(idx - 1);
                if (ch == 'V' && ch1 == 'I') {
                    ans += 4;
                    idx -= 2;
                } else if (ch == 'X' && ch1 == 'I') {
                    ans += 9;
                    idx -= 2;
                } else if (ch == 'L' && ch1 == 'X') {
                    ans += 40;
                    idx -= 2;
                } else if (ch == 'C' && ch1 == 'X') {
                    ans += 90;
                    idx -= 2;
                } else if (ch == 'D' && ch1 == 'C') {
                    ans += 400;
                    idx -= 2;
                } else if (ch == 'M' && ch1 == 'C') {
                    ans += 900;
                    idx -= 2;
                } else {
                    ans += romans.get(ch);
                    idx--;
                }
            } else {
                ans += romans.get(ch);
                idx--;
            }
        }
        return ans;
    }
}
