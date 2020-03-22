package loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 1; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {
                if ( cell==row || cell==size+1-row) {
                    System.out.print("0");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
    }

}
