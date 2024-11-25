class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}


class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class Q24 {


    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate is too old for recruitment. (" + age + " years)");
        } else if (age < 20) {
            throw new TooYounger("Candidate is too young for recruitment. (" + age + " years)");
        } else {
            System.out.println("Candidate is eligible for recruitment.");
            System.out.println("Candidate Name: " + name);
        }
    }

    public static void main(String[] args) {
        try {

            String candidateName = "John Doe";
            int candidateAge = 50;


            checkEligibility(candidateName, candidateAge);

        } catch (TooOlder e) {

            System.out.println("Exception: " + e.getMessage());
        } catch (TooYounger e) {

            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
