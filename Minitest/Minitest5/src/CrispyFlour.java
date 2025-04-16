import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;
    public CrispyFlour() {}
    public CrispyFlour(String id,String name, int cost, LocalDate manufacturingDate, int quantity) {
        super(id, name, cost, manufacturingDate);
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double getAmount() {
        return quantity * super.getCost();
    }
    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }
    @Override
    public double getRealMoney() {
        if (this.getExpiryDate().isBefore(LocalDate.now().plusMonths(2))) {
            return getAmount() * 0.6;
        } else if (this.getExpiryDate().isBefore(LocalDate.now().plusMonths(4))) {
            return getAmount() * 0.8;
        } else {
            return getAmount() * 0.95;
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", quantity= " + quantity;
    }
}
