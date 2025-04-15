public class StaffFulltime extends Staff {
    private double bonus;
    private double fined;
    private double baseSalary;

    public StaffFulltime() {
    }

    public StaffFulltime(String id, String name, int age, String phoneNumber, String email, double bonus, double fined, double baseSalary) {
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fined = fined;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getFined() {
        return fined;
    }

    public void setFined(double fined) {
        this.fined = fined;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return baseSalary - fined + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary= " + String.format("%.0f", getSalary()) + "VNĐ";
    }
}

