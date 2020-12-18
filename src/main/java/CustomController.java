import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class represents the controller which takes
 * information from the view and updates the model.
 *
 * The entire controller could be different depending on the application.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomController implements ActionListener {

    /**
     * The model that this controller will be communicating with.
     */
    private CustomModel model;
    /**
     * The view that this controller will be communicating with.
     */
    private CustomView view;

    /**
     * Constructor for instances of CustomController.
     * Creates a new controller that is linked with the given model and view.
     *
     * @param model the model that this controller is linked to
     * @param view the view that this controller is linked to
     */
    public CustomController(CustomModel model,CustomView view) {
        this.model=model;
        this.view=view;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        String entry = view.getEntry();
        model.updateCommand(entry);
    }
}
