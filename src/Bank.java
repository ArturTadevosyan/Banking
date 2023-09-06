public class Bank {
    public int amount;

    public Bank(int amount) {
        this.amount = amount;
    }

    public synchronized void pay(int cashedOut) {
        int newBalance = amount - cashedOut;
        amount = newBalance;
    }
}
