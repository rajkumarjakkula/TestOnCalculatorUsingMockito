import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    Calculator calc=null;
    ArithmeticOperations arithmetic=mock(ArithmeticOperations.class);
    @BeforeEach
    void assignObject()
    {
        calc=new Calculator(arithmetic);
    }
    @Test
    void toReturnSumOfTwoPositiveValues()
    {
        when(arithmetic.sum(4.0,4.0)).thenReturn(8.0);
        assertEquals(8.0,calc.sum(4.0,4.0));
    }

    @Test
    void toReturnDifferenceOfTwoPositiveValues()
    {
        when(arithmetic.subtract(4.0,2.0)).thenReturn(2.0);
        assertEquals(2.0,calc.subtract(4.0,2.0));
    }
    @Test
    void toReturnMultiplyOfTwoPositiveValues()
    {
        when(arithmetic.multiply(4.0,4.0)).thenReturn(16.0);
        assertEquals(16.0,calc.multiply(4.0,4.0));
    }
    @Test
    void toReturnDivisionOfTwoPositiveValues()
    {
        when(arithmetic.divide(4.0,2.0)).thenReturn(2.0);
        assertEquals(2.0,calc.divide(4.0,2.0));
    }
}
