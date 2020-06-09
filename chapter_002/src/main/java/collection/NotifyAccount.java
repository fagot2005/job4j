package collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rls = new HashSet<>();
// for-each accounts to HashSet;
        for (Account list:accounts
             ) {
            rls.add(list);
        }
        return rls;
    }
}
