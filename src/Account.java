public class Account {
    public int number;

    public String agency;

    public String name;

    public double balance;

    public void Say(String message) {
        System.out.println(message);
    }

    public void SayWelcome() {
        Say("Hello " + name + ", thank you for creating an account with us, your agency is " + agency + ", account " + number + " and your balance " + balance + " is already available for withdrawal");
    }
}
