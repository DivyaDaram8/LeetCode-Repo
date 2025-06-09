class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i <= edges.length; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            boolean[] vis = new boolean[edges.length+1];
            if(hasPath(graph, u, v, vis)){
                return edge;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return new int[0];
    }
    public boolean hasPath(List<List<Integer>> graph, int src, int dest, boolean[] vis){
        if(src == dest) return true;
        vis[src] = true;
        for(int neighbour: graph.get(src)){
            if(!vis[neighbour]){
                if(hasPath(graph, neighbour, dest, vis)){
                    return true;
                }
            }
        }
        return false;
    }
}