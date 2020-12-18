/**
 * This class represents the concrete implementation of the abstract
 * template method pattern.
 *
 * This class will implement first rate, second rate, and amount differently than others.
 * Then when {@link CustomAbstractTemplate#calculateFormula()} is invoked in the superclass
 * it will use the values that are concretely defined in this subclass or any other concrete
 * subclass that implements it.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomConcreteClass extends CustomAbstractTemplate {

    /**
     * Amount factor that could be different for every subclass.
     */
    public static final double amountFactor = 50.0;
    /**
     * Rate factor that could be different for every subclass.
     */
    public static final double rateFactor = 2.0;

    /**
     * Constructor for instances of CustomConcreteClass.
     * Creates a new instance with the given initial amount, first rate, and second rate.
     *
     * @param initialAmount the initial amount
     * @param initialRate the initial rate
     */
    public CustomConcreteClass(double initialAmount, double initialRate) {
        super(initialAmount,initialRate);
    }

    /**
     * This concrete class' implementation of the amount calculation.
     *
     * @return the result of the amount calculation
     */
    @Override
    public double calculateAmount() {
        return getInitialAmount()+amountFactor;
    }

    /**
     * This concrete class' implementation of the rate calculation.
     *
     * @return the result of the rate calculation
     */
    @Override
    public double calculateRate() {
        return getInitialRate()*rateFactor;
    }

}
