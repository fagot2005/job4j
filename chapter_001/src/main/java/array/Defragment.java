package array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; // указатель, на не null ячейку.
                for (int indexNotNull = point + 1; indexNotNull < array.length; indexNotNull++) {
                       if (array[indexNotNull] != null) {
                        array[index] = array[indexNotNull];
                        array[indexNotNull] = null;
                        break;
                       }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
   }


    public static void main(String[] args) {
        String[] input = {"I", null, null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
