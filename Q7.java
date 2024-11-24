class Animal {
    public void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dogs bark.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cats meow.");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
