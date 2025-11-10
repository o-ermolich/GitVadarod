package ermolich_homework.task_16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts = new HashSet<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount)
            throws AccountNotFoundException, NotEnoughMoneyException {
        Account fromAccount = null;
        Account toAccount = null;

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumberFrom)) {
                fromAccount = account;
            }
            if (account.getAccountNumber().equals(accountNumberTo)) {
                toAccount = account;
            }
        }


        if (fromAccount == null || toAccount == null) {
            throw new AccountNotFoundException("Not found account", "not.found.account");
        }

        if (fromAccount.getBalance() < amount) {
            throw new NotEnoughMoneyException("Not enough money", "not.enough.money");
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
    }
}
