import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing class for decorator pattern.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
class CustomDecoratorTest {

    /**
     * Testing custom component.
     */
    private CustomComponent comp1, comp2;

    /**
     * Create new concrete implementations before each test.
     */
    @BeforeEach
    void setUp() {
        comp1 = new CustomConcreteDecoratorA(new CustomConcreteComponent());
        comp2 = new CustomConcreteDecoratorB(new CustomConcreteComponent());
    }

    /**
     * This tests the operation based on what concrete subclass is implemented.
     */
    @Test
    void operation() {
        assertEquals("operation different because impl. A",comp1.operation());
        assertEquals("operation different because impl. B",comp2.operation());
    }
}