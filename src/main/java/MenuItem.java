/**
 * This class represents a menu item that can be
 * embedded within a menu.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public class MenuItem {
    /**
     * The name of the menu item.
     */
    private String name;
    /**
     * The value of the menu item.
     */
    private double value;

    /**
     * Default constructor for instances of MenuItem.
     * Creates a new item with no name and zero value.
     */
    public MenuItem() {
        name=null;
        value=0;
    }

    /**
     * Constructor for instances of MenuItem.
     * Creates a new item with the given name and value.
     *
     * @param name the name of the item
     * @param value the value of the item
     */
    public MenuItem(String name, double value) {
        this.name=name;
        this.value=value;
    }

    /**
     * Set the name of this menu item.
     *
     * @param name the name to give the item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the value of this menu item.
     *
     * @param value the value to give the item
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Retrieves an XML representation of the menu item.
     *
     * @return xml string of the menu item
     */
    public String toXML() {
        StringBuilder sb = new StringBuilder("\t<menuitem>\n");
        sb.append("\t\t<name>").append(name).append("</name>\n");
        sb.append("\t\t<value>").append(value).append("</value>\n");
        sb.append("\t</menuitem>");
        return sb.toString();
    }
}
