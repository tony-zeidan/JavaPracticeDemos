/**
 * This class represents a concrete implementation of the decorator.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public class CustomConcreteDecoratorA extends CustomDecorator {

    /**
     * Constructor for instances of CustomConcreteDecoratorA.
     * Creates a new decorator with the associated component.
     *
     * @param component the component that this operations will invoke on
     */
    public CustomConcreteDecoratorA(CustomComponent component) {
        super(component);
    }

    /**
     * Use the super's operation and add something to it.
     *
     * @return the result of the operation
     */
    public String operation() {
        return super.operation() + " different because impl. A";
    }
}
