package bank;

public interface MakesWithdraw {
    public double withdraw(Transaction tx) throws InsufficientFundsException;
}
