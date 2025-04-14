import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "shirt", 25.0, 5);
        products[1] = new Product(2, "shoes", 30.0, 8);
        products[2] = new Product(3, "pants", 35.0, 9);
        products[3] = new Product(4, "book", 50.0, 10);
        products[4] = new Product(5, "hut", 35.0, 12);
        products[0].setStoreName("Warehouse ABC");
        for (Product product : products) {
            product.Display();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String nameProduct = sc.nextLine();
        boolean exist = false;
        for (Product product : products) {
            if (product.getName().equals(nameProduct)) {
                product.Display();
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("Product does not exist");
        }
        System.out.println("Enter the lowest price of the product you want to find: ");
        double priceProduct = sc.nextDouble();
        for (Product product : products) {
            if (product.getPrice() > priceProduct) {
                product.Display();
            }
        }
        int maxQuantity = 0;
        for (Product product : products) {
            if (product.getQuantity() > maxQuantity) {
                maxQuantity = product.getQuantity();
            }
        }
        for (Product product : products) {
            if (product.getQuantity() == maxQuantity) {
                System.out.println("Product with largest quantity in stock(" + maxQuantity + ") is: ");
                product.Display();
            }
        }
        double sumPrice = 0;
        int sumQuantity = 0;
        for (Product product : products) {
            sumPrice += product.getTotalInventoryValue();
            sumQuantity += product.getQuantity();
        }
        System.out.println("Total products is: " + Product.totalProduct);
        System.out.println("Total inventory value is " + sumPrice);
        System.out.println("Average inventory value is " + sumPrice / sumQuantity);
        products[0].setStoreName("Kho miền Nam");
        System.out.println("New store name is: " + Product.storeName);
    }
}