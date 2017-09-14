package fry.future.chainConstructors.encapsulateSubclassWithCreationMethods;

import java.time.LocalDate;

/**
 *
 * @author ranjeet
 */
public class RevolvingTermROC extends Loan {

    protected RevolvingTermROC(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity) {
        super(notional, outstanding, rating, expiry, maturity);
    }


    @Override
    public double calcCapital() {
        return this.getRating() * this.getOutstanding();
    }


}
