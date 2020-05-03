package array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        if (result==false) {
            result = true;
            for (int i = 1; i < data.length; i++) {
                if (data[i] != data[i - 1]) {
                    result = false;
                    break;
                }
            }
        } else {
            for (int i=1; i<data.length; i++) {
                if (data[i] != data[i - 1]) {
                    result = false;
                    break;
                }
            }
        }

        return result;
        }
    }
