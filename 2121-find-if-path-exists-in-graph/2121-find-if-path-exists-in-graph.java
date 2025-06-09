class Solution {
    public boolean dfs(List<List<Integer>> graph, int curr, int dest, boolean[] vis){
        if(curr == dest) return true;
        vis[curr] = true;
        for(int neighbour : graph.get(curr)){
            if(!vis[neighbour]){
                if(dfs(graph, neighbour, dest, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] vis = new boolean[n];
        return dfs(graph, source, destination, vis);
    }
}