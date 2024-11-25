class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}


class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Q25 {


    public static void validateUser(String username, String password) throws InvalidUsernameException, InvalidPasswordException {

        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }


        String correctPassword = "password123";


        if (!password.equals(correctPassword)) {
            throw new InvalidPasswordException("Password does not match.");
        }


        System.out.println("Login successful!");
    }

    public static void main(String[] args) {
        try {

            String username = "John";
            String password = "pass123";


            validateUser(username, password);

        } catch (InvalidUsernameException e) {

            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidPasswordException e) {

            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
