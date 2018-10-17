/**
 * A naive customer record for a 30-day rolling mobile contract.
 * The record keeps track of the current funds.
 * The customer can top-up.
 * The mobile company can renew the contract.
 *
 * @author kl
 */

public class CustomerRecord {

    private double funds;
    private String name;

    /**
     * Constructs a customer record with zero funds.
     */
    public CustomerRecord(String name) {
        funds = 0.0;
        this.name = name;
    }

    /**
     * Tops up.
     * @param amount the amount to top up
     */
    public void topUp(double amount) {
        System.out.println("Thread with id " +
                            Thread.currentThread().getId() + ", "
                            + "topping up " + amount);

        double newFunds = funds + amount;

        System.out.println("Thread with id " +
                            Thread.currentThread().getId() + ", "
                            + "current funds: " + newFunds);

        funds = newFunds;
    }

    /**
     * Makes a monthly payment.
     * @param amount the amount to pay
     */
    public void renewContract(double amount) {
        System.out.println("Thread with id " +
                            Thread.currentThread().getId() + ", "
                            + "making monthly payment " + amount);

        double newFunds = funds - amount;

        System.out.println("Thread with id " +
                            Thread.currentThread().getId() + ", "
                            + "current funds: " + newFunds);

        funds = newFunds;
    }

    /**
     * Gets the current funds.
     * @return the current funds
     */
    public double getFunds() {
        return funds;
    }

    /**
     * Gets the customer name.
     * @return the customer name
     */
    public String getName() {
        return name;
    }
}
