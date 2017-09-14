package fry.future.chainConstructors;

/**
 *
 * @author ranjeet
 */
public class TermROC implements CapitalStrategy {

    @Override
    public void strategy() {
        System.out.println(this.getClass().getCanonicalName());
    }

}
