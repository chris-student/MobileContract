public class RenewContractRunnable implements Runnable {
    private static final int DELAY = 1;
    private CustomerRecord customer;
    private double amount;

    public RenewContractRunnable(CustomerRecord c, double a) {
        this.customer = c;
        this.amount = a;
    }

    @Override
    public void run() {
        try {
            customer.renewContract(amount);
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {}
    }
}
