package exception;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User corectUser = new User("", false);
        for (int i = 0; i<users.length; i++){
            if (!users[i].getUserName().equals(login)) {
                throw new UserNotFoundException("User is not found in Database");
            }else corectUser = users[i];
        }return corectUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.toString().length()<3){
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
