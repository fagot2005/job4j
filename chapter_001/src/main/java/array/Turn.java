package array;

public class Turn {
    public static int[] back(int[] array) {
       int countElement = array.length;
       int temp = 0;
            for (int i = 0; i < countElement / 2; i++) {
                temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        return array;
    }

    public static void main(String[] args) {

        int[] temp2 = new int[] {3, 9, 45, 66, 77, 150};
        back(temp2);
        for (int i = 0; i <= temp2.length - 1; i++) {
            System.out.println(temp2[i]);
        }

    }
}
