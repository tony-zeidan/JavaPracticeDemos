/**
 * This class represents a concrete leaf component in
 * the Composite Design Pattern.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomLeaf extends CustomComponent {

    /**
     * Constructor for instances of CustomLeaf.
     * Creates a new leaf component with the given name and id number.
     *
     * @param name the name of the leaf
     * @param id the id number of the leaf
     */
    public CustomLeaf(int id, String name) {
        super(id,name);
    }

    /**
     * Print this leaf element (id and name).
     */
    @Override
    public void printComponent() {
        //print the id and name of this leaf
        System.out.println(getClass().getSimpleName() +
                String.format("(id: %d, name: %s)",getId(),getName()));
    }
}
