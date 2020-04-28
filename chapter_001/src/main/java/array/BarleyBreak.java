package array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = count;
                count = count + 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("["+i+"] ["+j+"]   "+table[i][j]);
            }
        }
    }
}
