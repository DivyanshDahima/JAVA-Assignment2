class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dogs can bark.");
    }
}

public class Q13 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.walk();
        dog.bark();
    }
}
