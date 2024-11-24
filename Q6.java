public class Q6 {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Q6 demo = new Q6();

        System.out.println("Sum of 5 and 10 (int): " + demo.add(5, 10));

        System.out.println("Sum of 5, 10, and 15 (int): " + demo.add(5, 10, 15));

        System.out.println("Sum of 5.5 and 10.5 (double): " + demo.add(5.5, 10.5));
    }
}
