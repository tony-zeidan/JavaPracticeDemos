import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a concrete model for a basic application.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomModel implements CustomObservable {

    /**
     * The current command (this will be updated).
     */
    private String command;
    /**
     * List of observers for this model.
     */
    private List<CustomObserver> observers;

    /**
     * Default constructor for instances of CustomModel.
     * Creates a new model with no observers and default command.
     */
    public CustomModel() {
        command="DEFAULT";
        observers = new ArrayList<>();
    }

    /**
     * Updates the current command stored within this model
     * and notifies all observers of this event.
     *
     * @param command the new updated command
     */
    public void updateCommand(String command) {
        this.command=command;
        //generate event (packaged with the new command)
        CustomEvent event = new CustomEvent(this,command);
        //notify any observers of the event
        notifyObservers(event);
    }

    /**
     * Add a observer to this observable model.
     *
     * @param observer the observer to add
     */
    @Override
    public void addObserver(CustomObserver observer) {
        observers.add(observer);
    }

    /**
     * Remove a observer from this observable model.
     *
     * @param observer the observer to add
     */
    @Override
    public void removeObserver(CustomObserver observer) {
        observers.remove(observer);
    }

    /**
     * Notify any observers of an event that just occurred.
     *
     * @param e the event to notify the observers of
     */
    @Override
    public void notifyObservers(CustomEvent e) {
        for (CustomObserver obs : observers) {
            obs.handleCustomEvent(e);
        }
    }
}
