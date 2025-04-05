class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        Stack<Integer> s1=new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i=n2.length-1;i>=0;i--){
            int num=n2[i];
            while(!s1.isEmpty() && s1.peek()<=num){
               s1.pop(); 
            }
            if(s1.isEmpty()) map.put(num,-1);
            else map.put(num,s1.peek());
            
        s1.push(num);
        }
    
     for (int i = 0; i < n1.length; i++) {  
            n1[i] = map.containsKey(n1[i]) ? map.get(n1[i]) : -1;  
        }
        return n1;
    }
}