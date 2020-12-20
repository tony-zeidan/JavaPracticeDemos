/**
 * This class represents a concrete observer that will be listening
 * to events from the concrete observable.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomConcreteObserver implements CustomObserver {

    /**
     * A field for this observer representing a generic name.
     */
    private String name;

    /**
     * Constructor for instances of CustomObserver.
     * Creates a new concrete observer with the given name.
     *
     * @param name The name of this observer
     */
    public CustomConcreteObserver(String name) {
        this.name=name;
    }

    /**
     * Handle the events thrown by the concrete observable.
     *
     * @param e The event (packaged with a command)
     */
    @Override
    public void handleCustomEvent(CustomEvent e) {
        //simply output that the command has been received
        System.out.println(name + " received event (updated command = " + e.getCommand() + ")");
    }
}