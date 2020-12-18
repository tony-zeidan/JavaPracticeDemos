import java.util.EventObject;

/**
 * This class represents a custom event that can
 * be thrown by the main observable.
 */
public class CustomEvent extends EventObject {

    private String command;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @param command the command to send along with this Event
     * @throws IllegalArgumentException if source is null
     */
    public CustomEvent(Object source, String command) {
        super(source);
        this.command=command;
    }

    /**
     * Retrieves the command packaged in the Event.
     *
     * @return The command of this Event
     */
    public String getCommand() { return command; }
}
