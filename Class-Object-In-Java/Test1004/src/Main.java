public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Tran Huy Hoang", 24, "hoang1111uuu@gmail.com", 8, 11);
        students[1] = new Student("Dao Duy Anh", 33, "duyanhdao1991@gmail.com", 8.5, 3);
        students[2] = new Student("Bui Van Long", 23, "longbui2002@gmail.com", 9.5, 2);
        students[3] = new Student("Nguyen Van Tuan", 30, "tuannguyen1995@gmail.com", 9.1, 5);
        students[4] = new Student("Nguyen Van A", 28, "anguyen1111@gmail.com", 7.5, 7);
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAge();
        }
        System.out.println("The average age of students is: " + sum / students.length);
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() > 5) {
                count++;
            }
        }
        System.out.println("Number of students passing: " + count);
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFullName().equals("Nguyen Van A")) {
                System.out.println("Student Nguyen Van A's email is: " + students[i].getEmail());
                exist = true;
                break;
            }
        }
        if (!exist) {
            System.out.println("No student named Nguyen Van A found!");
        }
    }
}