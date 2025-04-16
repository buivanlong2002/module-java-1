import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;
    public Meat(){}
    public Meat(String id,String name, int cost, LocalDate manufacturingDate,double weight){
        super(id, name, cost, manufacturingDate);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public double getAmount() {
        return weight * super.getCost();
    }
    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }
    @Override
    public double getRealMoney() {
        if (this.getExpiryDate().isBefore(LocalDate.now().plusDays(5))){
            return getAmount() * 0.7;
        } else {
            return getAmount() * 0.9;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", weight= " + weight;
    }
}
