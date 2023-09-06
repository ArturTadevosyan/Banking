public class BankThread extends Thread {
    private Bank bank;
    private int money;

    public BankThread(Bank bank, int money) {
        this.bank = bank;
        this.money = money;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bank.pay(money);
    }
}
