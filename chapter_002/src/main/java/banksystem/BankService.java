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
            if (entry.getKey().getPassport().equals(passport)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            int acc = 0;
            for (Account userAcc : accounts
            ) {
                if (userAcc.requisite.equals(requisite)) {
                    return accounts.get(acc);
                }
            }
            acc++;
        }
        return null;
    }


    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        User user = findByPassport(srcPassport);
        //System.out.println(user.getUsername());
        Account account = findByRequisite(user.getPassport(), dеstRequisite);
        //System.out.println(account.requisite);
        //BankService.findByRequisite

        account.setBalance(account.getBalance() + amount);
        //System.out.println(account.getBalance());
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
