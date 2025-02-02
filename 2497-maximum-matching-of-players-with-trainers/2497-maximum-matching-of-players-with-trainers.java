class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0;
        for(int j = 0; j < trainers.length && i < players.length; j++){
            if(players[i] <= trainers[j]){
                i++;
            }
        }
        return i;
    }
}