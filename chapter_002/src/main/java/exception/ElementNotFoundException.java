package exception;



public class ElementNotFoundException extends Exception {

    public UserInputException(String message) {
        super(message);
    }

    public static int indexOf(String[] value, String key)   {
        int rls = -1;
        for (int index = 0; index < value.length; index++) {
            if ((value.length != 0 && value != null) || value[index].equals(key)) {
                rls = index;
            }
            }
        }

    public static void main (String[] args) throws UserInputException {
        String[] str = {"Eva, Mark, Eric, Marta, Denis"};
        try {
            if (indexOf(str, "Nic") == 0);
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
