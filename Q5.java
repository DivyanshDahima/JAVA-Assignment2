class Animal {
    String name;
    int age;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "Rio";
        dog.age = 7;

        dog.eat();
        dog.sleep();

        dog.bark();
    }
}
