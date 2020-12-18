/**
 * This class provides the demo component of the Template Method Pattern.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
public class CustomTemplateDemo {

    public static void main(String[] args) {
        CustomConcreteClass concrete1 = new CustomConcreteClass(100,1.5);
        double result1 = concrete1.calculateFormula();
        System.out.println("The concrete1 calculated formula: " + result1);
        CustomConcreteClassTwo concrete2 = new CustomConcreteClassTwo(100,1.5);
        double result2 = concrete2.calculateFormula();
        System.out.println("The concrete2 calculated formula: " + result2);
    }
}
