/**
 * A top-up runnable makes a top-up
 * into a customer record.
 *
 * @author kl
 */
public class TopUpRunnable implements Runnable {
    private static final int DELAY = 1;
    private CustomerRecord customer;
    private double amount;

    /**
     * Constructs a top-up runnable.
     * @param c the customer record into which to top-up
     * @param a the amount to top-up
     */
    public TopUpRunnable(CustomerRecord c, double a) {
        this.customer = c;
        this.amount = a;
    }

    @Override
    public void run() {
        try {
            customer.topUp(amount);
            Thread.sleep(DELAY);
        }
        catch (InterruptedException exception) {}
    }
}
