interface Interface1 {
    void method1a();
    void method1b();
}


interface Interface2 {
    void method2a();
    void method2b();
}


interface Interface3 {
    void method3a();
    void method3b();
}


interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void methodCombined();
}


class ConcreteClass {
    void concreteMethod() {
        System.out.println("This is a method from the concrete class.");
    }
}


class MyClass extends ConcreteClass implements CombinedInterface {

    public void method1a() {
        System.out.println("Method1a from Interface1");
    }

    public void method1b() {
        System.out.println("Method1b from Interface1");
    }


    public void method2a() {
        System.out.println("Method2a from Interface2");
    }

    public void method2b() {
        System.out.println("Method2b from Interface2");
    }


    public void method3a() {
        System.out.println("Method3a from Interface3");
    }

    public void method3b() {
        System.out.println("Method3b from Interface3");
    }


    public void methodCombined() {
        System.out.println("MethodCombined from CombinedInterface");
    }
}


public class Q18 {
    static void useInterface1(Interface1 i1) {
        i1.method1a();
        i1.method1b();
    }

    static void useInterface2(Interface2 i2) {
        i2.method2a();
        i2.method2b();
    }

    static void useInterface3(Interface3 i3) {
        i3.method3a();
        i3.method3b();
    }

    static void useCombinedInterface(CombinedInterface ci) {
        ci.methodCombined();
    }

    public static void main(String[] args) {

        MyClass obj = new MyClass();


        obj.concreteMethod();

        System.out.println("\nUsing Interface1:");
        useInterface1(obj);

        System.out.println("\nUsing Interface2:");
        useInterface2(obj);

        System.out.println("\nUsing Interface3:");
        useInterface3(obj);

        System.out.println("\nUsing CombinedInterface:");
        useCombinedInterface(obj);
    }
}
