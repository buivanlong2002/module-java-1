public class Motorbike extends Vehicle {
    private int enginePower;
    public Motorbike() {}
    public Motorbike(String id, String brand, int year, int enginePower) {
        super(id, brand, year);
        this.enginePower = enginePower;
    }
    public int getEnginePower() { return enginePower; }
    public void setEnginePower(int enginePower) { this.enginePower = enginePower; }
    @Override
    public void displayInfo() {
        System.out.println("Motorbike - ID: " + super.getId()
                + ", Brand: " + super.getBrand()
                + ", Year: " + super.getYear() +
                ", Engine Power: " + enginePower);
    }
    @Override
    public double calculateTax() {
        return enginePower < 100 ? 500 : 1000;
    }
}
