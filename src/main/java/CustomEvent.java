import java.util.EventObject;

/**
 * This class represents a custom event that can be thrown by any observable
 * and intercepted by any observer.
 *
 * This event must contain any information the view will need when it attemps
 * to handle the event.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomEvent extends EventObject {

    /**
     * Event comes packaged with a string command.
     */
    private String command;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @param command the command to be packaged with the event
     * @throws IllegalArgumentException if source is null
     */
    public CustomEvent(Object source, String command) {
        super(source);
        this.command=command;
    }

    /**
     * Retrieve the command within this event.
     *
     * @return the command
     */
    public String getCommand() {
        return command;
    }

}
