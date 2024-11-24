class Parent {

    public static void display() {
        System.out.println("Static method in Parent class.");
    }
}


class Child extends Parent {

    public static void display() {
        System.out.println("Static method in Child class.");
    }
}

public class Q8 {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();

        Parent parentRefChild = new Child();
        parentRefChild.display();
    }
}
