import java.util.Optional;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the expression : ");

        Optional<SimpleOperation> operation = parseOperation(reader);

        if (operation.isPresent()) {
            printResult(operation.get());
        }

        Number r = 8.21;

    }

    private static void printResult(SimpleOperation simpleOperation) {
        try {
            Number result = simpleOperation.getResult();
            System.out.printf(simpleOperation + " = " + result);
        } catch (Exception e) {
            System.out.println("Unable to calculate result of this operation " + simpleOperation);
        }
    }

    public static Optional<SimpleOperation> parseOperation(Scanner scanner) {
        try {
            Number num1 = readNextNumber(scanner);
            char op = scanner.next().charAt(0);
            Number num2 = readNextNumber(scanner);
            return Optional.of(new SimpleOperation(num1, op, num2));
        } catch (Exception e) {
            System.out.printf("Unable to parse operation, cause: %s", e.getMessage());
            return Optional.empty();
        }
    }

    public static Number readNextNumber(Scanner scanner) {

        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return scanner.nextFloat();
        }
    }
}