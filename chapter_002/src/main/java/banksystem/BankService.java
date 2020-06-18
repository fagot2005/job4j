package banksystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            accounts.add(account);
        }
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
            for (Account userAcc : accounts
            ) {
                if (userAcc.getRequisite().equals(requisite)) {
                    return userAcc;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        Account accountMinus = findByRequisite(srcPassport, srcRequisite);
        Account accountPlus = findByRequisite(destPassport, dеstRequisite);
        if ((accountMinus != null && accountPlus != null) && accountMinus.getBalance() >= amount) {
            accountMinus.setBalance(accountMinus.getBalance() - amount);
            accountPlus.setBalance(accountPlus.getBalance() + amount);
            //System.out.println(account.getBalance());
        }
        boolean rsl = false;
        return rsl;
    }
}
