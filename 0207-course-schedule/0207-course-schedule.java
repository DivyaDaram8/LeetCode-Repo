class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Directed graph
        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]); 
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recursionStack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (util(graph, visited, i, recursionStack)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean util(List<List<Integer>> graph, boolean[] visited, int curr, boolean[] stack) {
        visited[curr] = true;
        stack[curr] = true;

        for (int neighbour : graph.get(curr)) {
            if (stack[neighbour]) {
                return true; // cycle detected
            }
            if (!visited[neighbour] && util(graph, visited, neighbour, stack)) {
                return true;
            }
        }

        stack[curr] = false; // backtrack
        return false;
    }
}
