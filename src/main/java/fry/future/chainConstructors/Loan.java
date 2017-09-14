package fry.future.chainConstructors;

import java.time.LocalDate;

/**
 * You have multiple constructor that contain duplicate code.
 * <p>
 * Note : how to acheive least duplicate code ?.
 * </p>
 * Chain of constructors together to obtain the least duplicate code.
 *
 * @see LoanChainOfConstructor : Find two constructors (called A and B) that
 * contain duplicate code. Determine if A can call B or if B can call A, such
 * that the duplicate code can be safely (and hopefully easily) deleted from one
 * of the two constructors.
 * @See LoanCreationMethod: For every type of object that can be created using
 * one of the many constructors, create an intention-revealing Creation Method.
 * @author ranjeet
 */
public class Loan {

    private final float notional;
    private final float outstanding;
    private final int rating;
    private final LocalDate expiry;
    private final LocalDate maturity;
    private final CapitalStrategy strategy;

    public Loan(float notional, float outstanding, int rating, LocalDate expiry) {
        this.strategy = new TermROC();
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = null;
    }

    public Loan(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity) {
        this.strategy = new RevolvingTermROC();
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = LocalDate.now().plusYears(5);// 5 years from today
    }

    public Loan(float notional, float outstanding, int rating, LocalDate expiry, LocalDate maturity, CapitalStrategy strategy) {
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
        return "Loan{" + "notional=" + notional + ", outstanding=" + outstanding + ", rating=" + rating + ", expiry=" + expiry + ", maturity=" + maturity + ", strategy=" + strategy + '}';
    }

}
