/**
 * This class represents the context that uses strategies in the
 * strategy design pattern.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public class CustomContext {

    /**
     * The strategy that this class is currently using.
     * Note:
     *  This can be compared to the LayoutManagers used in Swing GUIs.
     *  Each frame uses a layout manager to calculate the spacing between
     *  objects on it's frame.
     */
    private CustomStrategy strategy;

    /**
     * Default constructor for instances of CustomContext.
     * Creates a new context with the default strategy attached.
     */
    public CustomContext() {
        strategy=new CustomConcreteStrategyA();
    }

    /**
     * Constructor for instances of CustomContext.
     * Creates a new context with the given strategy.
     *
     * @param strategy the strategy this context uses.
     */
    public CustomContext(CustomStrategy strategy) {

    }

    /**
     * Set the strategy that this context will use.
     *
     * @param strategy the new strategy
     */
    public void setStrategy(CustomStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Retrieve the result of the strategy operation.
     *
     * @param num1 the first number for the operation
     * @param num2 the second number for the operation
     * @return the result of the operation
     */
    public double executeStrategy(double num1, double num2) {
        return strategy.strategyOperation(num1,num2);
    }
}
