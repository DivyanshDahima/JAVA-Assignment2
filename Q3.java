public class Q3 {
    private String name;
    private int age;

    public Q3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Q3 person1 = new Q3("Alice", 25);
        Q3 person2 = new Q3("Bob", 30);

        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("\nDetails of Person 2:");
        person2.displayDetails();
    }
}
