class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1=0,s2=0;
        for(int x:aliceSizes){
            s1+=x;
        }
        for(int y:bobSizes){
            s2+=y;
        }
        int d=(s2-s1)/2;
        HashSet<Integer> bobSet = new HashSet<>();
        for (int candy : bobSizes) {
            bobSet.add(candy);
        }
        for(int z: aliceSizes){
            int a=z+d;
            if (bobSet.contains(a)) {
                return new int[]{z, a};  // Found a valid swap
            }
        }
        return new int[]{-1, -1};
    }
}