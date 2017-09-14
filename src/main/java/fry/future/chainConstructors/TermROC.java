package fry.future.chainConstructors;

/**
 *
 * @author ranjeet
 */
public class TermROC implements CapitalStrategy {


    /*
    Sample calculation
     */
    @Override
    public double calc(Loan loan) {
        return loan.getRating() * loan.getOutstanding();
    }

}
