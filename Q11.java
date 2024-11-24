class Num {

    protected int number;

    public Num(int number) {
        this.number = number;
    }


    public void shownum() {
        System.out.println("Decimal Value: " + number);
    }
}

class HexNum extends Num {


    public HexNum(int number) {
        super(number);
    }


    @Override
    public void shownum() {

        super.shownum();
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}


public class Q11 {
    public static void main(String[] args) {

        Num num = new Num(255);
        System.out.println("Base Class Output:");
        num.shownum();


        HexNum hexNum = new HexNum(255);
        System.out.println("\nDerived Class Output:");
        hexNum.shownum();
    }
}
