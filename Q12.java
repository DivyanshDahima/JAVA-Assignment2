class Distance {

    protected double distance;


    public Distance(double distance) {
        this.distance = distance;
    }


    public void travelTime() {
        double speed = 60.0;
        double time = distance / speed;
        System.out.println("Distance in Miles: " + distance);
        System.out.println("Travel Time (at 60 miles/hour): " + time + " hours");
    }
}


class DistanceMKS extends Distance {

    public DistanceMKS(double distance) {
        super(distance);
    }


    @Override
    public void travelTime() {
        double speed = 100.0;
        double time = distance / speed;
        System.out.println("Distance in Kilometers: " + distance);
        System.out.println("Travel Time (at 100 km/second): " + time + " seconds");
    }
}


public class Q12 {
    public static void main(String[] args) {

        Distance distanceMiles = new Distance(300);
        System.out.println("Base Class Output:");
        distanceMiles.travelTime();


        DistanceMKS distanceKilometers = new DistanceMKS(300);
        System.out.println("\nDerived Class Output:");
        distanceKilometers.travelTime();
    }
}
