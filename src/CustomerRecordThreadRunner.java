public class CustomerRecordThreadRunner {

    public static void main(String[] args) {
        CustomerRecord c = new CustomerRecord("Kostas Liaskos");

        TopUpRunnable tup = new TopUpRunnable(c, 15.0);
        RenewContractRunnable rn = new RenewContractRunnable(c,11.0);

        Thread topUpT = new Thread(tup);
        Thread renewT = new Thread(rn);

        renewT.start();
        topUpT.start();
    }
}
