class Solution {
    
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pth = new ArrayList<>();
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            pth.add(0);
            dfs(0, graph);
            return ans;

        
    }
    void dfs( int node, int[][] graph){
        if( node == graph.length-1){
            ans.add(new ArrayList<>(pth));
            return;
        }
        for( int ngh : graph[node]){
            pth.add(ngh);
            dfs( ngh, graph);
            //Backtracking
            pth.remove(pth.size() -1);
        }
    }
}