import java.time.LocalDate;

public abstract class Material {
    public String id;
    public String name;
    public int cost;
    public LocalDate manufacturingDate;
    public Material() {}
    public Material(String id, String name, int cost, LocalDate manufacturingDate) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.manufacturingDate = manufacturingDate;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
    public String toString() {
        return "id: " + id + ", name: " + name + ", cost: " + cost + ", manufacturingDate: " + manufacturingDate;
    }
}
