class Solution {
    public char nextGreatestLetter(char[] a, char key) {
        
        int start = 0;
        int end = a.length-1;
        if(key > a[end]){
            return a[start];//for ceiling
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        } 
        return a[start % a.length];
    }
        
 }
