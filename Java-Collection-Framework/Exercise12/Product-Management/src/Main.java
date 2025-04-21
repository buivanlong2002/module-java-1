import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product("P001", "Laptop Dell", 1500.0, 5));
        productManager.addProduct(new Product("P002", "Smartphone Samsung", 850.0, 10));
        productManager.addProduct(new Product("P003", "Tai nghe Bluetooth", 50.0, 25));
        productManager.addProduct(new Product("P004", "Bàn phím cơ", 120.0, 15));
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Show product list");
            System.out.println("2. Add product");
            System.out.println("3. Remove product by id");
            System.out.println("4. Edit product by id");
            System.out.println("5. Search product by name");
            System.out.println("6. Sort by price ascending");
            System.out.println("7. Sort by price descending");
            System.out.println("8. View operation history");
            System.out.println("0.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Show product list:");
                    productManager.printProducts();
                    break;
                case 2:
                    System.out.println("Enter id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter quantity: ");
                    int quantity = sc.nextInt();
                    productManager.addProduct(new Product(id, name, price, quantity));
                    break;
                case 3:
                    System.out.print("Enter id of the product: ");
                    String removedId = sc.nextLine();
                    productManager.removedProductById(removedId);
                    break;
                case 4:
                    System.out.print("Enter id of the product: ");
                    String editId = sc.nextLine();
                    productManager.editProductById(editId);
                    break;
                case 5:
                    System.out.print("Enter name of the product: ");
                    String searchName = sc.nextLine();
                    productManager.searchProductByName(searchName);
                    break;
                case 6:
                    productManager.sortProductsByPriceIncrease();
                    System.out.println("List of products sorted by price increased:");
                    productManager.printProducts();
                    break;
                case 7:
                    productManager.sortProductsByPriceDecrease();
                    System.out.println("List of products sorted by price decreased:");
                    productManager.printProducts();
                    break;
                case 8:
                    productManager.printHistory();
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
