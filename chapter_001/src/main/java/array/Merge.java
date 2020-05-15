package array;

public class Merge {

    public static int[] merge(int[] first, int[] second) {
        int[] thrid = new int[first.length + second.length];
        for (int i = 0; i < Math.max(first.length, second.length); i++) {
            if (i < first.length && i < second.length) {
                if (first[i] < second[i]) {
                    thrid[i * 2] = first[i];
                    thrid[i * 2 + 1] = second[i];
                } else {
                    thrid[i * 2] = second[i];
                    thrid[i * 2 + 1] = first[i];
                }
            } else  {
                if (first.length < second.length) {
                    thrid[first.length * 2 + (i - first.length)] = second[i];
                } else {
                    thrid[second.length * 2 + (i - second.length)] = first[i];
                }
            }
        }
        return thrid;
    }
}
