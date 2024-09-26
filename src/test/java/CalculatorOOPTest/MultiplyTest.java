package CalculatorOOPTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOP.CalculatorOOP;
import ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOPOld.CalculatorOOPOld;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class MultiplyTest {
    private final double valueA;
    private final double valueB;
    private final double expected;


    public MultiplyTest(double valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:MultiplyOf({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {2, 2, 4},
                {2, 0, 0},
                {0, 2, 0},
                {0, 0, 0},
                {-1, 1, -1}
        });
    }

    @Test
    public void multiplyTest(){
        Assertions.assertEquals(expected, new CalculatorOOP(valueA, valueB, '*').calc());
    }
}
