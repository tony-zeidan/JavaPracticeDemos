/**
 * This class represents a concrete implementation of the
 * strategy in the strategy pattern.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public class CustomConcreteStrategyA implements CustomStrategy {

    /**
     * Implementation of the strategy operation.
     *
     * @param num1 the first number of the operation
     * @param num2 the second number of the operation
     * @return the result of the operation
     */
    @Override
    public double strategyOperation(double num1, double num2) {
        return num1+num2;
    }
}
