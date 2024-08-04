package bank;

import java.util.Scanner;

public class AccountOpener {

    protected Account account;

    protected Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.ENGLISH);

    public AccountOpener(Account acc) {
        account = acc;
    }

    public void SayWelcome() {
        Account createdAccount = getAccount();
        System.out.println(
            "Hello " + createdAccount.getName()
            + ", Welcome to " + createdAccount.getBank().getName()
            + ", thank you for creating an account with us, your agency is " + createdAccount.getAgency()
            + ", account " + createdAccount.getNumber()
            + " and your balance " + createdAccount.getBalance()
            + " is already available for withdrawal"
        );

        scanner.close();
    }

    public AccountOpener setBank(Bank bank) {
        account.bank = bank;
        return this;
    }

    public AccountOpener captureNumber() {
        account.number = captureInt("Please enter your account number:");
        return this;
    }

    public AccountOpener captureAgency() {
        account.agency = captureText("Please enter your agency:");
        return this;
    }

    public AccountOpener captureName() {
        account.name = captureText("Please enter your name:");
        return this;
    }

    public AccountOpener captureBalance() {
        account.balance = 0;
        Transaction tx = new Transaction(captureDouble("Please enter your first deposit value:"), "First deposit");
        account.deposit(tx);
        return this;
    }

    public Account getAccount() {
        return account;
    }

    private int captureInt(String instruction) {
        System.out.println(instruction);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid number, please try again");
            scanner.next();
            return captureInt(instruction);
        }
    }

    private String captureText(String instruction) {
        System.out.println(instruction);
        return scanner.next();
    }

    private double captureDouble(String instruction) {
        System.out.println(instruction);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid number, please try again");
            scanner.next();
            return captureDouble(instruction);
        }
    }
}
