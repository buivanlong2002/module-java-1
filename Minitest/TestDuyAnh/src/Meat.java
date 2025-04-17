import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public Meat() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate dateNow = LocalDate.now();
        if (dateNow.isAfter(getExpiryDate().minusDays(5))) {
            return getAmount() * 30 / 100;
        }
        else return getAmount() * 10 /100;
    }

    @Override
    public String toString() {
        return super.toString()
                + "{weight=" + weight
                + ", amount=" + getAmount()
                + ", expiryDate=" + getExpiryDate()
                + ", realMoney=" + getRealMoney()
                + "}";
    }
}