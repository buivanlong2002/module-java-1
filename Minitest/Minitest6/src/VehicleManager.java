import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private LinkedList<String> history = new LinkedList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        if (vehicle instanceof Car) {
            history.add("Add car to vehicle list" );
        }
        if (vehicle instanceof Motorbike) {
            history.add("Add motorbike to vehicle list");
        }
    }
    public void removeVehicle(String id) {
        boolean removed = vehicles.removeIf(vehicle -> vehicle.getId().equals(id));
        if (removed) {
            System.out.println("Removed vehicle by id: " + id);
            history.add("Removed vehicle by id: " + id);
        } else {
            System.out.println("Vehicle not found");
            history.add("Failed to remove vehicle by id: " + id);
        }
    }
    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
        history.add("Show vehicle list");
    }
    public void displayTaxReport() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("ID: " + vehicle.getId() + ", Tax: " + vehicle.calculateTax());
        }
        history.add("Show tax report");
    }
    public void sortByYear() {
        Collections.sort(vehicles);
        history.add("Sorted by Year");
    }
    public void sortByBrand() {
        vehicles.sort(new BrandComparator());
        history.add("Sorted by Brand");
    }
    public void sortByTax() {
        vehicles.sort(new TaxComparator());
        history.add("Sorted by Tax");
    }
    public void printHistory() {
        System.out.println("----- History -----");
        for(String s : history) {
            System.out.println(s);
        }
    }
}
