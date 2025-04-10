public class Student {
    private String fullName;
    private int age;
    private String email;
    private double grade;
    private int id;
    public Student(String fullName, int age, String email, double grade, int id) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.grade = grade;
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(float grade) {
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
