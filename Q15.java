class Person {

    private int person_id;
    private String person_name;
    private double income;

    public Person(int person_id, String person_name, double income) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.income = income;
    }

    public void displayDetails() {
        System.out.println("Person ID: " + this.person_id);       // Using 'this' to access instance variables
        System.out.println("Person Name: " + this.person_name);
        System.out.println("Income: " + this.income);
    }

    public void show() {
        System.out.println("\nCalling displayDetails() using 'this':");
        this.displayDetails();
    }
}

public class Q15 {
    public static void main(String[] args) {

        Person person = new Person(201, "Divyansh Dahima", 75000);

        person.show();
    }
}
