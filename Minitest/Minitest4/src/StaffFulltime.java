public class StaffFulltime extends Staff {
    private double bonus;
    private double fine;
    private double baseSalary;
    public StaffFulltime() {}
    public StaffFulltime(String id, String name, int age, String phoneNumber, String email, double bonus, double fine, double baseSalary) {
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getFine() {
        return fine;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double getSalary() {
        return baseSalary - fine + bonus;
    }
    @Override
    public String toString() {
        return super.toString() + ", salary= " + String.format("%.0f", getSalary()) + "VNĐ";
    }
}

