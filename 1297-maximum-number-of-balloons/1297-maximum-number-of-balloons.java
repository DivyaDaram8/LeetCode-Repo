class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String name = "balloon";
        int res = 0;
        for(char ch : text.toCharArray()){
            if(name.indexOf(ch) != -1){
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }

        if(!hm.containsKey('b')|| !hm.containsKey('a') || !hm.containsKey('l')
        || !hm.containsKey('o') || !hm.containsKey('n')){
            return res;
        }else{
            res = Math.min(hm.get('b'), 
                            (Math.min(hm.get('a'), (Math.min(hm.get('l') / 2, (Math.min(hm.get('o') / 2, hm.get('n'))))))));
        }
        return res;
    }
}