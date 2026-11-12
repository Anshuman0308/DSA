
class Solution {

    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        boolean[][] vst = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (bt(board, word, vst, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    boolean bt(char[][] board, String word,
               boolean[][] vst, int i, int j, int index) {

        // Base case
        if (index == word.length()) {
            return true;
        }

        // Boundary + visited + character check
        if (i < 0 || j < 0 ||
            i >= board.length || j >= board[0].length ||
            vst[i][j] ||
            board[i][j] != word.charAt(index)) {

            return false;
        }

        // Mark visited
        vst[i][j] = true;

        // Explore four directions
        boolean found =
            bt(board, word, vst, i + 1, j, index + 1) ||
            bt(board, word, vst, i - 1, j, index + 1) ||
            bt(board, word, vst, i, j + 1, index + 1) ||
            bt(board, word, vst, i, j - 1, index + 1);

        // Backtracking: unmark visited
        vst[i][j] = false;

        return found;
    }
}
