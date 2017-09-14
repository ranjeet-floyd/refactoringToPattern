package fry.future.chainConstructors;

/**
 *
 * @author ranjeet
 */
public class RevolvingTermROC implements CapitalStrategy {

    public RevolvingTermROC() {
    }

    /*
    Sample calculation
     */
    @Override
    public double calc(Loan loan) {
        return loan.getRating() * loan.getOutstanding();
    }


}
