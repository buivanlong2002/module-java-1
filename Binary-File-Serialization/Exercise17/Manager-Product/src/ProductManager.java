import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    private final String filePath = "C:\\Users\\minht\\Desktop\\CodeGym Module2\\Binary-File-Serialization\\Exercise17\\Manager-Product\\products.txt";

    public void addProduct(Product p) {
        products.add(p);
        saveToFile();
    }

    public void showProducts() {
        loadFromFile();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            products.forEach(System.out::println);
        }
    }

    public void searchProductById(String id) {
        loadFromFile();
        boolean found = false;
        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("Find product with Id " + id + " is: " + p);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No product found with ID: " + id);
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.err.println("File write error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        File file = new File(filePath);
        if (!file.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            products = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("File read error: " + e.getMessage());
        }
    }
}