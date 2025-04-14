public class ProgrammingBook extends Book{
    private String language;
    private String framework;
    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }
    public String getLanguage() {
        return language;
    }
    public String getFramework() {
        return framework;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setFramework(String framework) {
        this.framework = framework;
    }
    @Override
    public double getPrice() {
        return super.getPrice() * 0.95;
    }
    @Override
    public void display() {
        super.display();
        System.out.print(", Price: " + this.getPrice() + ", Language: " + this.language + ", Framework: " + this.framework + "\n");
    }
}
