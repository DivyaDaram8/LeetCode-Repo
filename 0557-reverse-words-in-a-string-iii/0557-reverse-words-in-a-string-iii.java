class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder revSent = new StringBuilder();
        
        for (String word : words) {
            char[] chars = word.toCharArray();
            int left = 0, right = chars.length - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            revSent.append(new String(chars)).append(" ");
        }
        
        return revSent.toString().trim();
    }
}
