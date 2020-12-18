/**
 * This class represents the super class in the Template Method Pattern
 * which will hold the template method.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public abstract class CustomAbstractTemplate {

    /**
     * The initial amount that was passed.
     */
    private double initialAmount;
    /**
     * The initial rate that was passed.
     */
    private double initialRate;

    /**
     * Constructor for instances of CustomAbstractClass.
     * Initializes with the given initial amount, and rate.
     *
     * @param initialAmount the initial amount
     * @param initialRate the initial rate
     */
    public CustomAbstractTemplate(double initialAmount, double initialRate) {
        this.initialAmount = initialAmount;
        this.initialRate = initialRate;
    }

    /**
     * This method represents a template method.
     * Calculates the custom formula based on parameters contained
     * within the subclasses.
     *
     * @return the result of the calculated formula
     */
    public double calculateFormula() {
        return calculateAmount()*calculateRate();
    }

    /**
     * Retrieve the rate which is implemented differently
     * by different subclasses of this one.
     *
     * @return The first rate
     */
    public abstract double calculateRate();

    /**
     * Retrieve the amount which is implemented differently
     * by different subclasses of this one.
     *
     * @return The second amount
     */
    public abstract double calculateAmount();

    /**
     * Retrieves the initial amount that was passed.
     *
     * @return the initial amount
     */
    public double getInitialAmount() {
        return initialAmount;
    }

    /**
     * Retrieves the initial rate that was passed.
     *
     * @return the initial rate
     */
    public double getInitialRate() {
        return initialRate;
    }

}
