import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter a size for the array (negative value to trigger exception): ");
            int arraySize = scanner.nextInt();


            int[] arr = new int[arraySize];
            System.out.println("Array of size " + arraySize + " created successfully.");


            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();


            int result = numerator / denominator;
            System.out.println("Result of division: " + result);

        } catch (NegativeArraySizeException e) {

            System.out.println("Exception caught: Cannot create an array with a negative size.");
            System.out.println("Exception details: " + e);

        } catch (ArithmeticException e) {

            System.out.println("Exception caught: Division by zero is not allowed.");
            System.out.println("Exception details: " + e);

        } finally {

            System.out.println("Program execution completed.");
        }

        scanner.close();
    }
}
