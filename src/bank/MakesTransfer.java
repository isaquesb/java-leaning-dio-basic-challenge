package bank;

public interface MakesTransfer {
    public void transfer(Account to, Transaction tx) throws InsufficientFundsException;
}
