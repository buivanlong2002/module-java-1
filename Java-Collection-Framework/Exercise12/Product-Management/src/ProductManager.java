import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();
    private LinkedList<String> history = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        products.add(product);
        history.add("Added product with ID: " + product.getId() + " to list");
    }
    public void editProductById(String id) {
        boolean found = false;
        for (Product product : products) {
            if (id.equals(product.getId())) {
                System.out.println("You want to edit the product: " + product);
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                System.out.print("Enter new quantity: ");
                int newQuantity = scanner.nextInt();
                product.setName(newName);
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                System.out.println("Product with ID: " + product.getId() + " has been edited: " + product);
                history.add("Edited product with ID: " + product.getId() + " to list");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product with ID: " + id + " does not exist");
        }
    }
    public void removedProductById(String id) {
        boolean removed = products.removeIf(product -> product.getId().equals(id));
        if (removed) {
            System.out.println("You want to removed the product with ID: " + id);
            history.add("Removed product with ID: " + id);
        } else {
            System.out.println("Product with ID: " + id + " does not exist");
            history.add("Failed to remove product with ID: " + id);
        }
    }
    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
        history.add("Show product list: ");
    }
    public void searchProductByName(String name) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Found product with name " + name + " is: " + product);
                history.add("Found product with name " + name + " is: " + product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Product with name " + name + " does not exist");
            history.add("Failed to find product with name " + name);
        }
    }
    public void sortProductsByPriceIncrease() {
        products.sort(new PriceIncreaseComparator());
        history.add("Sorted by Price Increase");
    }
    public void sortProductsByPriceDecrease() {
        products.sort(new PriceDecreaseComparator());
        history.add("Sorted by Price Decrease");
    }
    public void printHistory() {
        System.out.println("-----History-----");
        for (String s : history) {
            System.out.println(s);
        }
    }
}
