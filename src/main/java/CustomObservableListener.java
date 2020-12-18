/**
 * This interface ensures that every observer for the main observable
 * can handle it's events.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public interface CustomObservableListener {

    /**
     * Handle the custom event that the main model will throw.
     *
     * @param e The event (packaged with a command)
     */
    void handleCustomEvent(CustomEvent e);
}
