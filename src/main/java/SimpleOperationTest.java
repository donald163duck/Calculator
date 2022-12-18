import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SimpleOperationTest {

    @Test
    public void SimpleOperation () {

            SimpleOperation simpleOperation = new SimpleOperation();
            simpleOperation.setNum1(10);
            simpleOperation.setNum2(2);
            simpleOperation.setOp('*');

            Number result = simpleOperation.getResult();
            Float rt = 20.0F;
            assertEquals(rt, result);
            System.out.println("Test OK!");
    }





}
