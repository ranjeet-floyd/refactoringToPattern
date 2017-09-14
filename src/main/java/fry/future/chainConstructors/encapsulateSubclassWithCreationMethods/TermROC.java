package fry.future.chainConstructors.encapsulateSubclassWithCreationMethods;

import java.time.LocalDate;

/**
 *
 * @author ranjeet
 */
public class TermROC extends Loan {

    protected TermROC(float notional, float outstanding, int rating, LocalDate expiry) {
        super(notional, outstanding, rating, expiry, null);
    }

    @Override
    public double calcCapital() {
        return this.getRating() * this.getOutstanding();
    }


}
