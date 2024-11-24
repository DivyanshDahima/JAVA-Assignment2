public class Q4 {
    private String name;
    private int age;

    public Q4() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("No-argument constructor called.");
    }

    public Q4(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Constructor with one argument called.");
    }

    public Q4(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with two arguments called.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Q4 person1 = new Q4();
        person1.displayDetails();

        Q4 person2 = new Q4("Ali");
        person2.displayDetails();

        Q4 person3 = new Q4("Bob", 30);
        person3.displayDetails();
    }
}
