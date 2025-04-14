public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static String storeName;
    static int totalProduct;
    static double totalInventoryValue;
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProduct ++;
        totalInventoryValue += totalInventoryValue;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalInventoryValue() {
        return this.price * this.quantity;
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    void Display() {
        System.out.println("Information of production " + this.id + " icludes: " + "{name: " + this.name + ", price: " + this.price + ", quantity: "
                + this.quantity + ", store name: " + this.storeName + "}");
    }
}
