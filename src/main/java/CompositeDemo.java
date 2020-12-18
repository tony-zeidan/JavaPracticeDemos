/**
 * This class creates a nested composite element and
 * then prints it.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CompositeDemo {

    /**
     * Main method
     * @param args N/A
     */
    public static void main(String[] args) {
        CustomComposite doc = new CustomComposite(0,"DOCUMENT");
        CustomLeaf leaf1 = new CustomLeaf(1,"LEAF 1");
        CustomLeaf leaf2 = new CustomLeaf(2,"LEAF 2");
        CustomLeaf leaf3 = new CustomLeaf(3,"LEAF 3");

        //composite element with two children
        CustomComposite comp1 = new CustomComposite(4,"COMP 1");
        CustomLeaf leaf4 = new CustomLeaf(5,"LEAF 4");
        CustomLeaf leaf5 = new CustomLeaf(6,"LEAF 5");
        comp1.addChild(leaf4);
        comp1.addChild(leaf5);

        //add all children to the document
        doc.addChild(leaf1);
        doc.addChild(leaf2);
        doc.addChild(leaf3);
        doc.addChild(comp1);
        doc.printComponent();

        //this will print the second child under composite (id:4)
        System.out.println("TEST: fetch second child of composite (id:4)");
        comp1.getChild(1).printComponent();
    }
}
