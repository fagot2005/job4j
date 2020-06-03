package exception;

public class ElementNotFoundException extends Exception {

    public static void main(String[] args) {
        String[] str = {"Eva", "Mark", "Eric", "Marta", "Denis"};
        String key = "Bil";
        FindEl.indexOf(str, key);
        try {
            if (FindEl.indexOf(str, key) != -1) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}

