class Solution {
     List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans.clear();
        path.clear();
      
        bt( 1, k, n);
      return ans;
    }
    private void bt( int s, int k, int rem){
        if( k == 0){
            if( rem == 0 ){
                ans.add(new ArrayList<>(path));
                         }
                         return;

        }
        if( rem <= 0 || 10 - s < k){
            return;
        }
        for(int i = s ; i<= 9; i++){
            if( i > rem) break;
            path.add(i);
            bt(i+1, k-1, rem -i);
            path.remove(path.size() -1);
        }
    }
}