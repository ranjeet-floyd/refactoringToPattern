package fry.future.chainConstructors;

/**
 *
 * @author ranjeet
 */
public enum LOAN_TYPE {

    TERM_LOAN("TL"),
    REVOLVER("RC");

    private final String val;

    private LOAN_TYPE(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

}
