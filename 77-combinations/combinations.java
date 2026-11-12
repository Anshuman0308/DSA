class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> res = new ArrayList<>();
         backtrack( n, k, 1, new ArrayList<>(), res);
         return res;

    }
    void backtrack(int n,int k,int s, List<Integer> cur, List<List<Integer>> res){
        if(cur.size() == k){
        res.add(new ArrayList<>(cur));
        return;
    }
        for(int i =s ; i<= n; i++){
            cur.add(i);
            backtrack(n,k,i+1,cur,res);
            cur.remove(cur.size() -1);
        }
    }
}