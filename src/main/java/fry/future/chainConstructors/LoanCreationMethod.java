package fry.future.chainConstructors;

import java.time.LocalDate;

/**
 * Constructor using creational method. Note: term Creation Method to refer to a
 * method that creates objects
 *
 * @author ranjeet
 */
public class LoanCreationMethod {

    private final float notional;
    private final float outstanding;
    private final int rating;
    private final LocalDate expiry;
    private final LocalDate maturity;
    private final CapitalStrategy strategy;

    public static LoanCreationMethod newTermLoan(float notional, float outstanding, int rating, LocalDate expiry) {
        LoanCreationMethod termLoan = new LoanCreationMethod(notional, outstanding, rating, expiry, null, new TermROC());
        return termLoan;
    }

    public static LoanCreationMethod newTermLoanWithStrategy(float notional, float outstanding, int rating, LocalDate expiry, CapitalStrategy strategy) {
        LoanCreationMethod termLoan = new LoanCreationMethod(notional, outstanding, rating, expiry, null, strategy);
        return termLoan;
    }

    public static LoanCreationMethod newRevolver(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity) {
        LoanCreationMethod termLoan = new LoanCreationMethod(notional, outstanding, rating, expiry, maturity, new RevolvingTermROC());
        return termLoan;
    }

    public static LoanCreationMethod newRevolverWithStrategy(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity, CapitalStrategy strategy) {
        LoanCreationMethod termLoan = new LoanCreationMethod(notional, outstanding, rating, expiry, maturity, strategy);
        return termLoan;
    }

    /*
    Catch all constructor
     */
    private LoanCreationMethod(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity, CapitalStrategy strategy) {
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
        return "LoanCreationMethod{" + "notional=" + notional + ", outstanding=" + outstanding + ", rating=" + rating + ", expiry=" + expiry + ", maturity=" + maturity + ", strategy=" + strategy + '}';
    }

}
