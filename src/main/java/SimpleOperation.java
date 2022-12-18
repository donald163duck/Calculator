import java.math.BigDecimal;

public class SimpleOperation {
    private Number num1;
    private char op;
    private Number num2;

    public Number getNum1() {
        return num1;
    }

    public void setNum1(Number num1) {
        this.num1 = num1;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public Number getNum2() {
        return num2;
    }

    public void setNum2(Number num2) {
        this.num2 = num2;
    }

    public SimpleOperation() {
    }

    public SimpleOperation(Number num1, char op, Number num2) {
        this.num1 = num1;
        this.op = op;
        this.num2 = num2;
    }

    public Number getResult() {
        BigDecimal bigDecimal1 = new BigDecimal(num1.floatValue());
        BigDecimal bigDecimal2 = new BigDecimal(num2.floatValue());
        switch (op) {
            case '+':
                return bigDecimal1.add(bigDecimal2).floatValue();
            case '-':
                return bigDecimal1.subtract(bigDecimal2).floatValue();
            case '*':
                return bigDecimal1.multiply(bigDecimal2).floatValue();
            case '/':
                return bigDecimal1.divide(bigDecimal2).floatValue();
            default:
                throw new IllegalArgumentException("Error! Enter correct operator " + op);
        }
    }

    @Override
    public String toString() {
        return num1 + " " + op + " " + num2;
    }
}
