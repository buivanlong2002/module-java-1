public class Employee {
    private String name;
    private String gender;
    private String dob;

    public Employee(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return name + ", " + gender + ", " + dob;
    }
}