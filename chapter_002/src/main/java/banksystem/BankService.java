package banksystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        //System.out.println(account);
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        users.put(findByPassport(passport), accounts);
    }

    public User findByPassport(String passport) {
        for (Map.Entry<User, List<Account>>  entry: users.entrySet()
        ) {
            if (entry.getKey().passport == passport) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        for (Map.Entry<User, List<Account>>  entry: users.entrySet()
             ) {
//            for (List acauntOfUsers: users.values()
//                 ) {
            for (Map entry.getValue(). acc:
                 ) {

            }
                System.out.println(entry.getKey() + ", " + entry.getValue());
//                if (entry.getKey().passport = passport &&
//                        acauntOfUsers.set(acauntOfUsers., users.values()) == requisite) {
//
//            }

        }
//        List<Account> allAcauntOfUsers = new ArrayList<>();
////        for (Map.Entry <User, List<Account>> entry: users.entrySet()
////             ) {
//            for (List<Account> : accounts
//                 ) {
//                User user = entry.getKey();
////                if (user.passport == passport &&
//                        allAcauntOfUsers.set(user.passport, ) == requisite)
            //}
        return null;
        }



    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }

//    public static void main(String[] args) {
//        List<Account> accounts = new ArrayList<>();
//        String requisite = "3fdsbb9";
//        accounts.add(new Account("3fdsbb9", 140));
//        int index = accounts.indexOf(new Account(requisite, -1));
//        Account find = accounts.get(index);
//        System.out.println(find.getRequisite() + " -> " + find.getBalance());
//    }
}
