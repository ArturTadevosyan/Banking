public class Main {

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank(1000);

        BankThread bankThread1 = new BankThread(bank, 100);
        BankThread bankThread2 = new BankThread(bank, 100);
        BankThread bankThread3 = new BankThread(bank, 100);
        BankThread bankThread4 = new BankThread(bank, 100);
        BankThread bankThread5 = new BankThread(bank, 100);
        BankThread bankThread6 = new BankThread(bank, 100);
        BankThread bankThread7 = new BankThread(bank, 100);
        BankThread bankThread8 = new BankThread(bank, 100);
        BankThread bankThread9 = new BankThread(bank, 100);
        BankThread bankThread10 = new BankThread(bank, 100);

        bankThread1.start();
        bankThread2.start();
        bankThread3.start();
        bankThread4.start();
        bankThread5.start();
        bankThread6.start();
        bankThread7.start();
        bankThread8.start();
        bankThread9.start();
        bankThread10.start();

        bankThread1.join();
        bankThread2.join();
        bankThread3.join();
        bankThread4.join();
        bankThread5.join();
        bankThread6.join();
        bankThread7.join();
        bankThread8.join();
        bankThread9.join();
        bankThread10.join();

        System.out.println(bank.amount);
    }

}
