/**
 * This interface contains the method that all concrete
 * strategies will need to implement.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public interface CustomStrategy {
    /**
     * Implementation of the strategy operation.
     *
     * @param num1 the first number of the operation
     * @param num2 the second number of the operation
     * @return the result of the operation
     */
    double strategyOperation(double num1, double num2);
}
