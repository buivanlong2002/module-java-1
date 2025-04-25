import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager products = new ProductManager();
        products.addProduct(new Product("P1", "iPhone 15 Pro", 999, "Apple", "Smartphone cao cấp với chip A17 và camera " +
                "48MP"));
        products.addProduct(new Product("P2", "Galaxy S24 Ultra", 1199, "Samsung", "Flagship Android với màn hình AMOLED 6" +
                ".8 inch"));
        products.addProduct(new Product("P3", "ThinkPad X1 Carbon", 1599, "Lenovo", "Laptop doanh nhân siêu nhẹ, pin lâu"));
        products.addProduct(new Product("P4", "AirPods Pro 2", 249, "Apple", "Tai nghe không dây chống ồn chủ động"));
        products.addProduct(new Product("P5", "Sony WH-1000XM5", 399, "Sony", "Tai nghe over-ear với chất lượng âm thanh " +
                "đỉnh cao"));
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Product");
            System.out.println("2. Show Product");
            System.out.println("3. Search Product By Id");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter product id: ");
                    String id = sc.nextLine();
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter product price: ");
                    int price = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter product brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter product description: ");
                    String description = sc.nextLine();

                    products.addProduct(new Product(id, name, price, brand, description));
                    System.out.println("Add product successfully!");
                    break;

                case 2:
                    System.out.println("\n--- List of Products ---");
                    products.showProducts();
                    break;

                case 3:
                    System.out.print("Enter product id: ");
                    String searchId = sc.nextLine();
                    products.searchProductById(searchId);
                    break;

                case 0:
                    System.out.println("Exit!");
                    break;

                default:
                    System.out.println("Choice invalid!");
            }

        } while (choice != 0);

        sc.close();
    }
}