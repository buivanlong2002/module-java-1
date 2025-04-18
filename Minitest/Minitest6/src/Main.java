import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();
        vehicleManager.addVehicle(new Car("C001", "Toyota", 2020, 5));
        vehicleManager.addVehicle(new Motorbike("M001", "Honda", 2018, 90));
        vehicleManager.addVehicle(new Car("C002", "BMW", 2022, 4));
        vehicleManager.addVehicle(new Motorbike("M002", "Yamaha", 2021, 120));
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Show vehicle list");
            System.out.println("2. Add vehicle");
            System.out.println("3. Remove vehicle by id");
            System.out.println("4. Show tax report");
            System.out.println("5. Sort by year of manufacture");
            System.out.println("6. Sort by brand of manufacture");
            System.out.println("7. Sort by ascending tax");
            System.out.println("8. View operation history");
            System.out.println("0.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    vehicleManager.displayAllVehicles();
                    break;
                case 2:
                    System.out.print("Select vehicle type (1. Car or 2. Motorbike): ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter brand: ");
                    String brand = sc.nextLine();
                    System.out.println("Enter year: ");
                    int year = sc.nextInt();
                    if (type == 1) {
                        System.out.println("Enter number of vehicles: ");
                        int numberOfVehicles = sc.nextInt();
                        vehicleManager.addVehicle(new Car(id, brand, year, numberOfVehicles));
                    } else if (type == 2) {
                        System.out.println("Enter Engine Power: ");
                        int enginePower = sc.nextInt();
                        vehicleManager.addVehicle(new Motorbike(id, brand, year, enginePower));
                    }
                    break;
                case 3:
                    System.out.print("Enter id of the vehicle: ");
                    String removedId = sc.nextLine();
                    vehicleManager.removeVehicle(removedId);
                    break;
                case 4:
                    vehicleManager.displayTaxReport();
                    break;
                case 5:
                    vehicleManager.sortByYear();
                    vehicleManager.displayAllVehicles();
                    break;
                case 6:
                    vehicleManager.sortByBrand();
                    vehicleManager.displayAllVehicles();
                    break;
                case 7:
                    vehicleManager.sortByTax();
                    vehicleManager.displayAllVehicles();
                    break;
                case 8:
                    vehicleManager.printHistory();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
        sc.close();
    }
}
