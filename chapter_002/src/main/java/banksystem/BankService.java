package banksystem;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (!user.isEmpty()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Account account = null;
        Optional<User> user = findByPassport(passport);
        if (!user.isEmpty()) {
            List<Account> accounts = users.get(user.get());
            return accounts.stream()
                    .filter(account1 -> account1.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> accountMinus = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> accountPlus = findByRequisite(destPassport, dеstRequisite);
        if ((!accountMinus.isEmpty() && !accountPlus.isEmpty())
                && accountMinus.get().getBalance() >= amount) {
            accountMinus.get().setBalance(accountMinus.get().getBalance() - amount);
            accountPlus.get().setBalance(accountPlus.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
