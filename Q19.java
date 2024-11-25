import java.util.Scanner;

public class Q19 {


    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {

            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();


            int result = divide(numerator, denominator);


            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception caught: " + e.getMessage());
        } finally {

            System.out.println("Execution completed. Thank you for using the program.");
        }
    }
}
