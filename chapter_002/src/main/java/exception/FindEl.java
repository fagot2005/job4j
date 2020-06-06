package exception;

public class FindEl  {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].contains(key)) {
                rsl = 1;
            }
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException{
        String[] str = {"Eva", "Mark", "Eric", "Marta", "Denis"};
        String key = "Bil";
        try {
            if (FindEl.indexOf(str, key) == -1) {
                throw new ElementNotFoundException("Ошибка, елемент не найден");
            }
        } catch (ElementNotFoundException elementNotFoundException) {
            elementNotFoundException.printStackTrace();
        }
    }
}
