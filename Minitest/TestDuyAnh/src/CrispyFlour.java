import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public CrispyFlour() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate dateNow = LocalDate.now();
        if (dateNow.isAfter(getExpiryDate().minusMonths(2))) {
            return getAmount() * 40 / 100;
        }

        else if (dateNow.isAfter(getExpiryDate().minusMonths(4))) {
            return getAmount() * 20 / 100;
        }
        return getAmount() * 5 /100;
    }

    @Override
    public String toString() {
        return super.toString()
                + "+{quantity="
                + quantity
                + ", amount="
                + getAmount()
                + ", expiryDate="
                + getExpiryDate()
                + ", realMoney="
                + getRealMoney()
                + "}";
    }
}