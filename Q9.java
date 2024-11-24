import java.util.Scanner;


abstract class ThreeDObject {

    public abstract double wholeSurfaceArea();

    public abstract double volume();
}


class Box extends ThreeDObject {
    private double length, width, height;


    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}


class Cube extends ThreeDObject {
    private double side;


    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * (side * side);
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}


class Cylinder extends ThreeDObject {
    private double radius, height;


    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}


class Cone extends ThreeDObject {
    private double radius, height;


    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}


public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter dimensions of the Box (length, width, height):");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());


        System.out.println("\nEnter the side length of the Cube:");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());


        System.out.println("\nEnter dimensions of the Cylinder (radius, height):");
        double radius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());


        System.out.println("\nEnter dimensions of the Cone (radius, height):");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}
