class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        backtrack(res, new StringBuilder(), 0, 0, n);

        return res;
    }

    void backtrack(List<String> res, StringBuilder str, int open, int close, int n) {

       
        if (str.length() == 2 * n) {
            res.add(str.toString());
            return;
        }

        if (open < n) {
            str.append('(');
            backtrack(res, str, open + 1, close, n);
            str.deleteCharAt(str.length() - 1);
        }

        if (close < open) {
            str.append(')');
            backtrack(res, str, open, close + 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}