package fry.future.chainConstructors;

import java.time.LocalDate;

/**
 * Chain of constructors together to obtain the least duplicate code.
 *
 * @author ranjeet
 */
public class LoanChainOfConstructor {

    private final float notional;
    private final float outstanding;
    private final int rating;
    private final LocalDate expiry;
    private final LocalDate maturity;
    private final CapitalStrategy strategy;

    public LoanChainOfConstructor(float notional, float outstanding, int rating, LocalDate expiry) {
        this(notional, outstanding, rating, expiry, null, new TermROC());
    }

    public LoanChainOfConstructor(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity) {
        this(notional, outstanding, rating, expiry, maturity, new RevolvingTermROC());
    }


    /*
    Catch all constructor
     */
    private LoanChainOfConstructor(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity, CapitalStrategy strategy) {
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = maturity;
        this.strategy = strategy;
    }

    public float getNotional() {
        return notional;
    }

    public float getOutstanding() {
        return outstanding;
    }

    public int getRating() {
        return rating;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public LocalDate getMaturity() {
        return maturity;
    }

    public CapitalStrategy getStrategy() {
        return strategy;
    }

    @Override
    public String toString() {
        return "LoanChainOfConstructor{" + "notional=" + notional + ", outstanding=" + outstanding + ", rating=" + rating + ", expiry=" + expiry + ", maturity=" + maturity + ", strategy=" + strategy + '}';
    }

}
