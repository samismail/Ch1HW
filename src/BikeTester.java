import java.lang.reflect.Array;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Schwinn", 2, 2014);
        Bike bike2 = new Bike("Jeep", 2, 2023);
        Bike bike3 = new Bike("Harley-Davison", 2, 2020);

        System.out.println("     Bikes");
        System.out.println(bike2);

        Bike bikeList[] = new Bike[]{bike1, bike2, bike3};

        System.out.println(bikeList);

    }
}
