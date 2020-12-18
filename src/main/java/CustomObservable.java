import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a concrete implementation of an observable.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomObservable {

    /**
     * A container for observers to notify when an event occurs.
     */
    private List<CustomObservableListener> observers;

    /**
     * A command string that this concrete observer will update.
     */
    private String command;

    /**
     * Default constructor for instances of CustomObservable.
     *
     */
    public CustomObservable() {
        observers = new ArrayList<>();
        command = "DEFAULT";
    }

    /**
     * Update the command contained within this observable and notify
     * all observers.
     *
     * @param command The new command
     */
    public void updateCommand(String command) {
        this.command = command;

        //package a new event with the updated command.
        CustomEvent event = new CustomEvent(this,command);

        //notify all observers of the updated command
        for (CustomObservableListener obs : observers) {
            obs.handleCustomEvent(event);
        }
    }

    /**
     * Add a observer to this observable object.
     *
     * @param observer the observer to add
     */
    public void addObserver(CustomObservableListener observer) {
        observers.add(observer);
    }

    /**
     * Remove a observer from this observable object.
     *
     * @param observer the observer to remove
     */
    public void removeObserver(CustomObservableListener observer) {
        observers.remove(observer);
    }

    /**
     * Main running method.
     * @param args N/A
     */
    public static void main(String[] args) {
        CustomObservable observable = new CustomObservable();
        CustomObservableListener observer1 = new CustomObserver("observer1");
        CustomObservableListener observer2 = new CustomObserver("observer2");
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.updateCommand("TEST1");
        observable.updateCommand("TEST2");
    }
}
