import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing class for this template method pattern demo.
 * Test every component of the calculated formula.
 *
 * @author Tony Zeidan
 * @version 12/18/2020
 */
class CustomAbstractTemplateTest {

    /**
     * Testing amount.
     */
    public static final double testAmount = 100;
    /**
     * Testing rate.
     */
    public static final double testRate = 1.5;

    /**
     * Test the two different implementations of the
     * concrete class.
     */
    private CustomAbstractTemplate concrete1,concrete2;

    /**
     * Create two new testing instances before each test.
     */
    @BeforeEach
    void setUp() {
        concrete1 = new CustomConcreteClass(testAmount,testRate);
        concrete2 = new CustomConcreteClassTwo(testAmount,testRate);
    }
    /**
     * Test the passing of the initial amounts.
     */
    @Test
    void getInitialAmount() {
        assertEquals(testAmount,concrete1.getInitialAmount());
        assertEquals(testAmount,concrete2.getInitialAmount());
    }

    /**
     * Test the passing of the initial rates.
     */
    @Test
    void getInitialRate() {
        assertEquals(testRate,concrete1.getInitialRate());
        assertEquals(testRate,concrete2.getInitialRate());
    }

    /**
     * Test the concrete implementations of the calculated amount.
     */
    @Test
    void calculateAmount() {
        assertEquals(CustomConcreteClass.amountFactor+testAmount,concrete1.calculateAmount());
        assertEquals(CustomConcreteClassTwo.amountFactor+testAmount,concrete2.calculateAmount());
    }

    /**
     * Test the concrete implementations of the calculated rate.
     */
    @Test
    void calculateRate() {
        assertEquals(CustomConcreteClass.rateFactor*testRate,concrete1.calculateRate());
        assertEquals(CustomConcreteClassTwo.rateFactor*testRate,concrete2.calculateRate());
    }

    /**
     * Test the template method calculated via the concrete implementations.
     */
    @Test
    void calculateFormula() {
        double expected1 = (CustomConcreteClass.amountFactor+testAmount)*(CustomConcreteClass.rateFactor*testRate);
        assertEquals(expected1,concrete1.calculateFormula());
        double expected2 = (CustomConcreteClassTwo.amountFactor+testAmount)*(CustomConcreteClassTwo.rateFactor*testRate);
        assertEquals(expected2,concrete2.calculateFormula());
    }
}