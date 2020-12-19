import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example represents a food menu that can be serialized
 * and deserialized.
 *
 * It uses a simple toXML() string to serialize to XML format.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
public class Menu extends DefaultHandler {

    /**
     * The list of menu items in the menu.
     */
    private List<MenuItem> items;
    /**
     * Flag to store what tag the XML parser is currently within.
     */
    private String xmlFlag;
    /**
     * MenuItem object to import after the menuitem tag has ended.
     */
    private MenuItem toImport;

    /**
     * Default constructor for instances of Menu.
     * Creates a new menu with no items in it.
     */
    public Menu() {
        items=new ArrayList<>();
    }

    /**
     * Adds the given menu item to the menu.
     *
     * @param item the menu item to add
     */
    public void addItem(MenuItem item) {
        items.add(item);
    }

    /**
     * Export the menu to XML format using the toXML() methods.
     *
     * @param path the path to save to
     */
    public void exportMenu(String path) {
        //write to a file and print outputs
        //this method just writes the to string of each person in the book
        //using the writer api
        try {
            File myFile = new File(path);
            FileWriter myWriter = new FileWriter(myFile);

            //This method will write the XML
            myWriter.write(toXML());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException ioException) {
            System.out.println("An error occurred.");
            ioException.printStackTrace();
        }
    }

    /**
     * Retrieves an XML string representation of the menu.
     *
     * @return xml string of menu
     */
    public String toXML() {
        StringBuilder sb = new StringBuilder("<menu>\n");
        for (MenuItem item : items) {
            sb.append(item.toXML()).append("\n");
        }
        sb.append("</menu>\n");
        return sb.toString();
    }

    /**
     * When an element is started in the xml document, ensure a new menu item
     * if the element corresponds to a menu item. Also ensure the xmlFlag is set
     * properly.
     *
     * @param u N/A
     * @param ln N/A
     * @param qName N/A
     * @param a N/A
     */
    @Override
    public void startElement(String u, String ln, String qName, Attributes a) {
        if (qName.equals("menuitem")) {
            toImport = new MenuItem();
        }
        xmlFlag = qName;
    }

    /**
     * When a string is found in the xml document, ensure that the current
     * menu item being read has it's fields set properly.
     *
     * @param ch N/A
     * @param start N/A
     * @param length N/A
     */
    @Override
    public void characters(char[] ch, int start, int length) {
        String str = new String(ch,start,length);
        switch (xmlFlag) {
            case "name" -> toImport.setName(str);
            case "value" -> toImport.setValue(Double.parseDouble(str));
        }
    }

    /**
     * When a xml tag ends, ensure that the menu item is added if
     * the tag corresponds to the tag of a menu item. Also reset xmlFlag.
     *
     * @param uri N/A
     * @param localName N/A
     * @param qName N/A
     */
    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("menuitem")) {
            addItem(toImport);
        }
        xmlFlag="";
    }

    /**
     * This method imports and deserializes the content of the menu XML file.
     * Uses SAX library.
     *
     * @return A new address book containing the deserialized menu item objects
     */
    public static Menu importMenu(String path) {
        SAXParserFactory spf = SAXParserFactory.newInstance();

        Menu menu = new Menu();
        try {
            SAXParser s = spf.newSAXParser();
            File f = new File(path);
            s.parse(f,menu);
        } catch (ParserConfigurationException e) {
            System.out.println("There was a parser configuration error.");
        } catch (SAXException e) {
            System.out.println("There was a SAX library error.");
        } catch (IOException e) {
            System.out.println("There was an error while writing.");
        }
        return menu;
    }

    /**
     * Main method for the menu.
     *
     * @param args N/A
     */
    public static void main(String[] args) {
        Menu m = new Menu();
        MenuItem it1 = new MenuItem("item1",10.0);
        MenuItem it2 = new MenuItem("item2",12.2);
        MenuItem it3 = new MenuItem("item3",14.4);
        m.addItem(it1);
        m.addItem(it2);
        m.exportMenu("file101102021.xml");
        m.addItem(it3);
        System.out.println("AFTER EXPORT:\n" + m.toXML());
        m = importMenu("file101102021.xml");
        System.out.println("AFTER IMPORT:\n" + m.toXML());
    }
}
