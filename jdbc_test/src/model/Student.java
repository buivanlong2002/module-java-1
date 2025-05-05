package model;

public class Student {
    private String name;
    private String email;
    private String phone;
    private String gender;
    private String birthday;

    public Student(String name, String email, String phone, String gender, String birthday) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getGender() { return gender; }
    public String getBirthday() { return birthday; }
}
