package exception;

public class ElementNotFoundException extends Exception {

    public static void main(String[] args) throws ElementNotFoundException{
        String[] str = {"Eva", "Mark", "Eric", "Marta", "Denis"};
        String key = "Bil";
        try {
            if (FindEl.indexOf(str, key) != -1) {
            }
        } catch (ElementNotFoundException elementNotFoundException) {
            elementNotFoundException.printStackTrace();
        }
    }
}

