public abstract class Vehicle implements Comparable<Vehicle> {
    private String id;
    private String brand;
    private int year;
    public Vehicle() {}
    public Vehicle(String id, String brand, int year) {
        this.id = id;
        this.brand = brand;
        this.year = year;
    }
    public String getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public abstract void displayInfo();

    public int compareTo(Vehicle other) {
        return Integer.compare(this.year, other.year);
    }
    public abstract double calculateTax();
}
