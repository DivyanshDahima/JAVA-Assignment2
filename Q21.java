import java.util.HashMap;
import java.util.Map;


class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class Q21 {


    public static String getCapital(String country) throws NoMatchFoundException {

        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Germany", "Berlin");


        if (countryCapitalMap.containsKey(country)) {
            return countryCapitalMap.get(country);
        } else {

            throw new NoMatchFoundException("No capital found for the country: " + country);
        }
    }

    public static void main(String[] args) {
        try {

            if (args.length == 0) {
                System.out.println("Please provide a country name as a command-line argument.");
                return;
            }


            String country = args[0];


            String capital = getCapital(country);


            System.out.println("The capital of " + country + " is " + capital);

        } catch (NoMatchFoundException e) {

            System.out.println("Exception: " + e.getMessage());
        }
    }
}
