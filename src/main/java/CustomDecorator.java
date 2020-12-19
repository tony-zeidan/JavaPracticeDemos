/**
 * This class represents the decorator component of the decorator pattern.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public abstract class CustomDecorator implements CustomComponent {

    /**
     * The component that this decorator will invoke operations on.
     */
    private CustomComponent component;

    /**
     * Constructor for instances of CustomDecorator.
     * Creates a new decorator with the associated component.
     *
     * @param component the component that this operations will invoke on
     */
    public CustomDecorator(CustomComponent component) {
        this.component=component;
    }

    /**
     * This method will invoke the operation on the component contained
     * within this decorator.
     */
    @Override
    public String operation() {
        return component.operation();
    }
}
