package CalculatorOOPTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOP;

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

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
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
        Assertions.assertEquals(expected, CalculatorOOP.calc(valueA, valueB, '-'));
    }
}
