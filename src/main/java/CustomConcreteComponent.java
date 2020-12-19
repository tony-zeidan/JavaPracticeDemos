/**
 * This class represents a concrete implementation of component in the decorator pattern.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public class CustomConcreteComponent implements CustomComponent {

    /**
     * Implementation of the operation in the decorator pattern.
     *
     * @return the result of the operation
     */
    @Override
    public String operation() {
        return "operation";
    }
}
