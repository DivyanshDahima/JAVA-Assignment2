class Calculator {

    static int objectCount = 0;


    int num1;
    int num2;

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        objectCount++;
    }

    static int getObjectCount() {
        return objectCount;
    }


    int calculateSum() {
        return num1 + num2;
    }
}

public class Q16 {
    public static void main(String[] args) {

        System.out.println("Objects created so far: " + Calculator.getObjectCount());

        Calculator calc1 = new Calculator(10, 20);
        Calculator calc2 = new Calculator(30, 40);

        System.out.println("Sum (calc1): " + calc1.calculateSum());
        System.out.println("Sum (calc2): " + calc2.calculateSum());

        System.out.println("Objects created so far: " + Calculator.getObjectCount());
    }
}
