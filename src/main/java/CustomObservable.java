/**
 * This interface contains the methods that any observable model
 * will have to implement.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public interface CustomObservable {
    /**
     * Add a observer to this observable model.
     *
     * @param observer the observer to add
     */
    void addObserver(CustomObserver observer);
    /**
     * Remove a observer from this observable model.
     *
     * @param observer the observer to add
     */
    void removeObserver(CustomObserver observer);
    /**
     * Notify any observers of an event that just occurred.
     *
     * @param e the event to notify the observers of
     */
    void notifyObservers(CustomEvent e);
}
