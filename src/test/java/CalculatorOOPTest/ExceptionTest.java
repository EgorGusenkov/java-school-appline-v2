package CalculatorOOPTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.gusenkovegor.javaschoolapplinev2.lesson5.CalculatorOOP.CalculatorOOP;

public class ExceptionTest {

    @Test
    public void IllegalArgumentExceptionTest(){
        try {
            new CalculatorOOP(2, 2, 'd').calc();
        } catch (IllegalArgumentException thrown) {
            Assertions.assertEquals("Неизвестная операция", thrown.getMessage());
        }
    }
}
