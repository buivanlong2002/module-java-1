public class StaffParttime extends Staff {
    private double workingHours;

    public StaffParttime() {
    }

    public StaffParttime(String id, String name, int age, String phoneNumber, String email, double workingHours) {
        super(id, name, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public double getSalary() {
        return this.getWorkingHours() * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + ", workingHours= " + workingHours + ", salary= " + String.format("%.0f", getSalary()) + "VNĐ";
    }
}
