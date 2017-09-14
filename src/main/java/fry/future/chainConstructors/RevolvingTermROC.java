package fry.future.chainConstructors;

/**
 *
 * @author ranjeet
 */
public class RevolvingTermROC implements CapitalStrategy {

    public RevolvingTermROC() {
    }

    @Override
    public void strategy() {
        System.out.println(this.getClass().getSimpleName());
    }

}
