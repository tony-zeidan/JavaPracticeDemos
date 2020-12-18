/**
 * This interface ensures every view handles the custom event when generated.
 */
public interface CustomObserver {
    /**
     * Handle the custom event.
     *
     * @param e the event that was triggered
     */
    void handleCustomEvent(CustomEvent e);
}
