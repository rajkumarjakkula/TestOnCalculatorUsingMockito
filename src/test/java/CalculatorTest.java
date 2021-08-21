import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc=null;
    @BeforeEach
    void assignObject()
    {
        calc=new Calculator();
    }
    @Test
    void toReturnSumOfTwoPositiveValues()
    {
        double actualOutput=calc.sum(4.0,4.0);
        double expectedOutput=8.0;
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    void toReturnDifferenceOfTwoPositiveValues()
    {
        double actualOutput=calc.substract(4.0,2.0);
        double expectedOutput=2.0;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    void toReturnMultiplyOfTwoPositiveValues()
    {
        double actualOutput=calc.multiply(4.0,4.0);
        double expectedOutput=16.0;
        assertEquals(actualOutput,expectedOutput);
    }
    @Test
    void toReturnDivisionOfTwoPositiveValues()
    {
        double actualOutput=calc.divide(4.0,2.0);
        double expectedOutput=2.0;
        assertEquals(actualOutput,expectedOutput);
    }
}
