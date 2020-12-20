/**
 * This interface contains the method that any observer should implement.
 */
public interface CustomObservable {
    /**
     * Adds an observer to the observable.
     *
     * @param observer the observable to add
     */
    void addObserver(CustomObserver observer);

    /**
     * Remove an observer from the observable.
     *
     * @param observer the observer to remove
     */
    void removeObserver(CustomObserver observer);

    /**
     * Notify all observers of an event that occurred.
     *
     * @param e the event that was triggered
     */
    void notifyObservers(CustomEvent e);
}
