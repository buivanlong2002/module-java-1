public class FictionBook extends Book {
    private String category;
    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public double getPrice() {
        return super.getPrice() * 0.93;
    }
    @Override
    public void display() {
        super.display();
        System.out.print(", Price: " + this.getPrice() + ", Category: " + this.category + "\n");
    }
}
