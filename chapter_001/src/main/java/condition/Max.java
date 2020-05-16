package condition;

public class Max {
    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }

    public static int max(int first, int second, int thrid) {
        int result = first >= max(second, thrid) ? first : max(second, thrid);
        return result;
    }

    public static int max(int first, int second, int thrid, int four) {
        int result = first >= max(second, thrid, four) ? first : max(second, thrid, four);
        return result;
    }
}
