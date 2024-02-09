// Bikes should at least have number of wheels, manufacturer and year data.
// Additional data can be created at the programmer’s discretion.

public class Bike {
    private String manufacturer;
    private int wheels;
    private int year;

    public Bike(String manufacturer, int wheels, int year){
        this.manufacturer = manufacturer;
        this.wheels = wheels;
        this.year = year;
    }
    public String getManufacturer (){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + '\n' +
                "Number of Wheels: " + wheels + '\n' +
                "Manufactured Year: " + year;
    }
}
