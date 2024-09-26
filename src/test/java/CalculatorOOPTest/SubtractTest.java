package CalculatorOOPTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOPOld.CalculatorOOPOld;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class SubtractTest {
    private final double valueA;
    private final double valueB;
    private final double expected;


    public SubtractTest(double valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:SubtractOf({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {4, 2, 2},
                {2, 4, -2},
                {0, 2, -2},
                {0, 0, 0},
                {-2, -2, 0}
        });
    }

    @Test
    public void subtractTest(){
        Assertions.assertEquals(expected, CalculatorOOPOld.calc(valueA, valueB, '-'));
    }
}
