package fry.future.chainConstructors;

import java.time.LocalDate;

/**
 * Constructor using creational method. Note: term Creation Method to refer to a
 * method that creates objects
 *
 * @author ranjeet
 */
public class LoanCreationMethod {

    private final LOAN_TYPE loan_type;
    private final float notional;
    private final float outstanding;
    private final int rating;
    private final LocalDate expiry;
    private final LocalDate maturity;
    private final CapitalStrategy strategy;


    public static LoanCreationMethod newTermLoan(float notional, float outstanding, int rating, LocalDate expiry) {
        return new LoanCreationMethod(LOAN_TYPE.TERM_LOAN, notional, outstanding, rating, expiry, null, new TermROC());
    }

    public static LoanCreationMethod newTermLoanWithStrategy(float notional, float outstanding, int rating, LocalDate expiry, CapitalStrategy strategy) {
        return new LoanCreationMethod(LOAN_TYPE.TERM_LOAN, notional, outstanding, rating, expiry, null, strategy);
    }

    public static LoanCreationMethod newRevolver(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity) {
        return new LoanCreationMethod(LOAN_TYPE.REVOLVER, notional, outstanding, rating, expiry, maturity, new RevolvingTermROC());
    }

    public static LoanCreationMethod newRevolverWithStrategy(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity, CapitalStrategy strategy) {
        return new LoanCreationMethod(LOAN_TYPE.REVOLVER, notional, outstanding, rating, expiry, maturity, strategy);
    }

    /*
    Catch all constructor
     */
    protected LoanCreationMethod(LOAN_TYPE loan_type, float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity, CapitalStrategy strategy) {
        this.loan_type = loan_type;
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

    public LOAN_TYPE getLoan_type() {
        return loan_type;
    }

    @Override
    public String toString() {
        return "LoanCreationMethod{" + "loan_type=" + loan_type + ", notional=" + notional + ", outstanding=" + outstanding + ", rating=" + rating + ", expiry=" + expiry + ", maturity=" + maturity + ", strategy=" + strategy + '}';
    }


}
