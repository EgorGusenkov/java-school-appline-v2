package CalculatorOOPTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOP;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class DivideTest {
    private final double valueA;
    private final double valueB;
    private final double expected;
    public Class<? extends Exception> expectedException;
    @Rule
    public ExpectedException thrown = ExpectedException.none();


    public DivideTest(double valueA, int valueB, int expected, Class<? extends Exception> expectedException) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
        this.expectedException = expectedException;
    }

    @Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {2, 2, 1, null},
                {2, 0, 0, ArithmeticException.class},
                {0, 2, 0, null},
                {0, 0, 0, ArithmeticException.class},
                {-1, 1, -1, null}
        });
    }

    @Test
    public void divideTest() throws ArithmeticException {
        if (expectedException != null) {
            thrown.expect(expectedException);
            Assertions.assertEquals(expected, CalculatorOOP.calc(valueA, valueB, '/'));
        }
    }
}
