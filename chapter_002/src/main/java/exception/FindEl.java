package exception;

public class FindEl  {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String x:value
        ) {
            if (x.contains(key)) {
                rsl = 1;
            }
        }
        return rsl;
    }
}
