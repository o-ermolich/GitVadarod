package ermolich_homework.task_16;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1, "12345", "BYN", 500.0);
        Account account2 = new Account(2, "67890", "BYN", 300.0);
        Account account3 = new Account(3, "54321", "BYN", 200.0);
        Account account4 = new Account(4, "98765", "BYN", 100.0);
        Account account5 = new Account(5, "13579", "BYN", 50.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        try {
            bank.transferMoney("12345", "67890", 500.0);
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }
    }
}
