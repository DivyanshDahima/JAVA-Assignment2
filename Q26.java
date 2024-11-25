// Custom Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q26 {


    public static void validateAge(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Invalid age entered for " + name + ": Age cannot be negative.");
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        try {

            String name = "Divyansh Dahima";
            int age = -5;


            validateAge(name, age);

        } catch (InvalidAgeException e) {

            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
