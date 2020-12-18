import javax.swing.*;
import java.awt.*;
import java.beans.Customizer;

/**
 * This class represents a simple GUI view in the MVC pattern.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomView extends JFrame implements CustomObserver {

    /**
     * Entry field.
     */
    private JTextField enterField;
    /**
     * A list model for the JList in this GUI.
     */
    private DefaultListModel<String> listModel;

    /**
     * DefaultConstructor for instances of CustomView.
     * Creates a new view that is observing a new model.
     */
    public CustomView() {
        CustomModel model = new CustomModel();
        model.addObserver(this);
        composeFrame(new CustomController(model,this));
    }

    /**
     * Add all of the components to the frame.
     *
     * @param controller the controller to link
     */
    private void composeFrame(CustomController controller) {
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(BorderLayout.NORTH,new JLabel("Enter here:"));
        enterField = new JTextField();
        enterField.addActionListener(controller);
        topPanel.add(BorderLayout.CENTER,enterField);
        listModel = new DefaultListModel<>();
        JList list = new JList(listModel);
        listModel.addElement("DEFAULT");
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(BorderLayout.NORTH,new JLabel("Input commands:"));
        bottomPanel.add(BorderLayout.CENTER,list);
        add(BorderLayout.NORTH,topPanel);
        add(BorderLayout.CENTER,bottomPanel);
    }

    /**
     * Prepare the frame to be displayed.
     */
    public void showFrame() {
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Retrieves the text in the entry field.
     *
     * @return the entry text
     */
    public String getEntry() {
        return enterField.getText();
    }

    /**
     * Handle the custom event.
     * This is an important part of MVC (could be vastly different depending on the view).
     *
     * @param e the event that was triggered
     */
    @Override
    public void handleCustomEvent(CustomEvent e) {
        enterField.setText("");
        //all we will do is add the command in the event to the list
        listModel.addElement(e.getCommand());
        //resize the frame to accommodate the new entry
        pack();
    }

    /**
     * Main method to run the application.
     *
     * @param args N/A
     */
    public static void main(String[] args) {
        CustomView view = new CustomView();
        view.showFrame();
    }
}
