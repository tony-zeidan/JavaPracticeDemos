import java.util.ArrayList;
import java.util.List;

/**
 * This class represent a concrete composite element in the Composite Design Pattern.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomComposite extends CustomComponent {

    /**
     * List of children for this composite element.
     */
    private List<CustomComponent> children;

    /**
     * Constructor for instances of CustomComposite.
     * Creates a new composite component with the given name and id number.
     *
     * @param name the name of the composite
     * @param id the id number of the composite
     */
    public CustomComposite(int id, String name) {
        super(id,name);
        children = new ArrayList<>();
    }

    /**
     * Print this composite element (id and name), as well
     * as all of its children.
     */
    @Override
    public void printComponent() {
        //print the composite's name and id
        System.out.println(getClass().getSimpleName() +
                String.format("(id: %d, name: %s)",getId(),getName()));
        //as well as all of its children (delegation)
        for (CustomComponent elem : children) {
            elem.printComponent();
        }
    }

    /**
     * Adds a child to this composite element.
     *
     * @param child the child to add
     */
    public void addChild(CustomComponent child) {
        children.add(child);
    }

    /**
     * Removes a child from this composite element.
     *
     * @param child the child to remove
     */
    public void removeChild(CustomComponent child) {
        children.remove(child);
    }

    /**
     * Retrieves the child at the given index.
     *
     * @param index the index to fetch the child from
     * @return the child or null
     */
    public CustomComponent getChild(int index) {
        if (index<0||index>=children.size()) {
            return null;
        }
        return children.get(index);
    }

}
