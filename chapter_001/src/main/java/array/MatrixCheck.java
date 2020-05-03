package array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char a = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == a) {
                for (int j = 1; j < board[i].length; j++) {
                    if (board[i][j] != a) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
