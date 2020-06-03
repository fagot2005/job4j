package exception;

public class FindEl {
    public static int indexOf(String[] value, String key)  {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].contains(key)) {
                rsl = 1;
            }
        }
        return rsl;
    }
}
