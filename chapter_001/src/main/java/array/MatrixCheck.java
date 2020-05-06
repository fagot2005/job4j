package array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j = 1; j < board[row].length; j++) {
           if (board[row][j] != 'X') {
              result = false;
              break;
              }
        }
        return result;
    }
}
