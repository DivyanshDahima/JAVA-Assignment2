class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class Q23 {


    public static void checkTemperature(double tempCelsius) throws TooHot, TooCold {
        if (tempCelsius > 35) {
            throw new TooHot("Temperature is too hot! (" + tempCelsius + "°C)");
        } else if (tempCelsius < 5) {
            throw new TooCold("Temperature is too cold! (" + tempCelsius + "°C)");
        } else {
            System.out.println("Temperature is normal: " + tempCelsius + "°C");

            double tempFahrenheit = (tempCelsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + tempFahrenheit + "°F");
        }
    }

    public static void main(String[] args) {
        try {

            if (args.length == 0) {
                System.out.println("Please provide the temperature in Celsius as a command-line argument.");
                return;
            }


            double temperature = Double.parseDouble(args[0]);


            checkTemperature(temperature);

        } catch (TooHot e) {

            System.out.println("Exception: " + e.getMessage());
        } catch (TooCold e) {

            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {

            System.out.println("Invalid input! Please enter a valid numeric temperature.");
        } catch (Exception e) {

            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
