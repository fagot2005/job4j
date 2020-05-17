package condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int thrid) {
        return max(thrid, max(first, second));
    }

    public static int max(int first, int second, int thrid, int four) {
        return max(four, max(thrid, max(first, second)));
    }
}
