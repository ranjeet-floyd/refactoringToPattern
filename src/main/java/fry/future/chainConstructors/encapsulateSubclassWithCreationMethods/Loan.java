package fry.future.chainConstructors.encapsulateSubclassWithCreationMethods;

import java.time.LocalDate;

/**
 * Subclasses implement a common interface but are constructed in diverse ways
 * <p>
 * Encapsulate the subclasses with intention-revealing Creation Methods in the
 * base class.
 * </p>
 *
 * @author ranjeet
 */
public abstract class Loan {

    private final float notional;
    private final float outstanding;
    private final int rating;
    private final LocalDate expiry;
    private final LocalDate maturity;

    protected Loan(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity) {
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = maturity;
    }


    /*
    Term Loan
     */
    public static Loan newTermLoan(float notional, float outstanding, int rating, LocalDate expiry) {
        return new TermROC(notional, outstanding, rating, expiry);
    }

    /*
    Revolver loan
     */
    public static Loan newRevolver(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity) {
        return new RevolvingTermROC(notional, outstanding, rating, expiry, maturity);
    }

    public abstract double calcCapital();

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

}
