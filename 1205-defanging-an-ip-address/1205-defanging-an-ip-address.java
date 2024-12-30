class Solution {
    public String defangIPaddr(String address) {
        String newIp ="";
        for(int i = 0; i< address.length(); i++){
            if(address.charAt(i) == '.'){
                newIp+= "[.]";
            }
            else{
                newIp += address.charAt(i);
            }
        }
        return newIp;
    }  
}