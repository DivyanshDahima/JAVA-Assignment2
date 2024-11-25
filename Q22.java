class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class Q22 {


    public static double calculateEquation(int a, int b, int c, int d) throws CustomArithmeticException {

        if (b == 0) {
            throw new CustomArithmeticException("Error: Division by zero in the first term (a / b).");
        }
        if (d == 0) {
            throw new CustomArithmeticException("Error: Division by zero in the second term (c / d).");
        }


        if (a % b != 0) {
            throw new CustomArithmeticException("Error: The first term (a / b) does not result in an exact division.");
        }
        if (c % d != 0) {
            throw new CustomArithmeticException("Error: The second term (c / d) does not result in an exact division.");
        }


        return (double) a / b + (double) c / d;
    }

    public static void main(String[] args) {
        try {

            System.out.println("Result: " + calculateEquation(10, 2, 20, 4));


            System.out.println("Result: " + calculateEquation(10, 0, 20, 4));


            System.out.println("Result: " + calculateEquation(10, 2, 20, 0));


            System.out.println("Result: " + calculateEquation(10, 3, 20, 4));


            System.out.println("Result: " + calculateEquation(10, 2, 21, 4));

        } catch (CustomArithmeticException e) {

            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
