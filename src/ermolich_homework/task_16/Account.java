package ermolich_homework.task_16;

public class Account {
    private int id;
    private String accountNumber;
    private String currency;
    private double balance;

    public Account(int id, String accountNumber, String currency, Double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        Account account = (Account) o;
        return  (id == account.id && accountNumber.equals(account.getAccountNumber()));
    }

    public int hashCode() {
        int result = (int) (id + accountNumber.hashCode());
        return result;
    }
}
