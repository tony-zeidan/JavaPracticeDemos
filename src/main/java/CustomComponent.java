/**
 * This class represents the conceptual component in the
 * Composite Design Pattern.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public abstract class CustomComponent {

    /**
     * The id number of the element.
     */
    private int id;
    /**
     * The name of the element.
     */
    private String name;

    /**
     * Constructor to be used through inheritance.
     * Initializes the element with the given id and name.
     *
     * @param id the id number of the element
     * @param name the name of the element
     */
    public CustomComponent(int id, String name) {
        this.id=id;
        this.name=name;
    }

    /**
     * Retrieve the id of this element.
     *
     * @return the id of the element
     */
    public int getId() {
        return id;
    }

    /**
     * Retrieve the name of this element.
     *
     * @return the name of the element
     */
    public String getName() {
        return name;
    }

    /**
     * Each component should have the ability to
     * print their name and their id (could be toString()).
     * We could make this better through the use of the
     * template method pattern.
     */
    public abstract void printComponent();
}
