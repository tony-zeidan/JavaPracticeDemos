import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing class for this implementation of the strategy pattern.
 *
 * @author Tony Zeidan
 * @version 12/19/2020
 */
class CustomContextTest {

    /**
     * Testing context.
     */
    private CustomContext ctx;

    /**
     * Create a new context for each test.
     */
    @BeforeEach
    void setUp() {
        ctx = new CustomContext();
    }

    /**
     * Test the results of the different strategies that can
     * be used in the context.
     */
    @Test
    void executeStrategy() {
        //default strategy is strategy 'A'
        assertEquals(15.0,ctx.executeStrategy(10,5));
        //switch strategy
        ctx.setStrategy(new CustomConcreteStrategyB());
        assertEquals(5.0,ctx.executeStrategy(10,5));
    }
}