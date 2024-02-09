import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Schwinn", 2, 2014);
        Bike bike2 = new Bike("Jeep", 2, 2023);
        Bike bike3 = new Bike("Harley-Davison", 2, 2020);

        System.out.println("     Bikes");

        ArrayList<Bike> bikeList = new ArrayList<Bike>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        bikeList.add(bike3);

        System.out.println(bikeList);

        int totalWheels = bike1.getWheels() + bike2.getWheels() + bike3.getWheels();
        int minYear = bike1.getYear();

        System.out.println("Total Number of Wheels: " + totalWheels);

        int i = 0;

        while (i < bikeList.size()) {
            if (bikeList.get(i).getYear() < minYear) {
                minYear = bikeList.get(i).getYear();
            }
            i++;
        }

        System.out.println("Oldest Bike's Year: " + minYear);

    }
}
