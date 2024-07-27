import java.util.Locale;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        account.Say("Please enter your account number:");
        account.number = scanner.nextInt();

        account.Say("Please enter your agency:");
        account.agency = scanner.next();

        account.Say("Please enter your name:");
        account.name = scanner.next();

        account.Say("Please enter your first deposit value:");
        account.balance = scanner.nextDouble();

        account.SayWelcome();
    }
}
