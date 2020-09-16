public class S_12 {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i,j,board,words,0)) return true;
            }
        }
        return false;
    }
    public boolean dfs(int i, int j, char[][] board, char[] words, int k) {
        if (i>=board.length||i<0||j<0||j>=board[0].length||words[k]!=board[i][j]) {
            return false;
        }
        if(k==words.length-1) return true;
        char temp = board[i][j];
        board[i][j] = '/';
        if (dfs(i+1,j,board,words,k+1)||dfs(i,j+1,board,words,k+1) ||
                dfs(i-1,j,board,words,k+1)||dfs(i,j-1,board,words,k+1) ) {
            return true;
        }
        board[i][j] = temp;
        return false;
    }


    public static void main(String[] args) {
        S_12 s = new S_12();
        char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = new String("ABCCED");
        System.out.println(s.exist(board,word));
    }
}
