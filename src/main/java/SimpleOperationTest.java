import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SimpleOperationTest {

    @Test
    public void SimpleOperation () {

            SimpleOperation simpleOperation = new SimpleOperation();
            simpleOperation.setNum1(2);
            simpleOperation.setNum2(3);
            simpleOperation.setOp('+');
            Number result = simpleOperation.getResult();
            assertEquals(5.0, result);
    }





}
