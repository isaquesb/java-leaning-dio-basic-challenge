import bank.Account;
import bank.AccountChecking;
import bank.AccountOpener;
import bank.Bank;

public class Terminal {

    public static void main(String[] args) {
        Account account = new AccountChecking();

        AccountOpener opener = new AccountOpener(account);

        opener.setBank(new Bank("MyBank"))
            .captureNumber()
            .captureAgency()
            .captureName()
            .captureBalance()
            .SayWelcome();
    }
}
