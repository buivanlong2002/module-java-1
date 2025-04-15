import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Staff[] staffs = new Staff[6];

        staffs[0] = new StaffFulltime("FT001", "Nguyễn Văn A", 30, "0901234567", "a@gmail.com", 2000000, 500000, 12000000);
        staffs[1] = new StaffFulltime("FT002", "Trần Thị B", 28, "0902345678", "b@gmail.com", 500000, 1000000, 25000000);
        staffs[2] = new StaffFulltime("FT003", "Lê Văn C", 35, "0903456789", "c@gmail.com", 1500000, 0, 22000000);

        staffs[3] = new StaffParttime("PT001", "Phạm Thị D", 22, "0904567890", "d@gmail.com", 64);
        staffs[4] = new StaffParttime("PT002", "Đỗ Văn E", 24, "0905678901", "e@gmail.com", 80);
        staffs[5] = new StaffParttime("PT003", "Vũ Thị F", 21, "0906789012", "f@gmail.com", 56);

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. List of all staffs");
            System.out.println("2. Average salary");
            System.out.println("3. Full-time staffs earn lower than average salary");
            System.out.println("4. Total part-time salary");
            System.out.println("5. Arrange full-time staffs by increasing salary");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    displayAllStaffs(staffs);
                    break;
                case 2:
                    averageSalary(staffs);
                    System.out.println("Average salary is: " + String.format("%.0f", averageSalary(staffs)) + "VNĐ");
                    break;
                case 3:
                    staffsFulltimeSalaryLower(staffs);
                    break;
                case 4:
                    totalParttimeSalary(staffs);
                    break;
                case 5:
                    arrangeStaffFulltimeBySalary(staffs);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
        sc.close();
    }
    public static void displayAllStaffs(Staff[] staffs) {
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }
    public static double averageSalary(Staff[] staffs) {
        double sumSalary = 0;
        for (Staff staff : staffs) {
            sumSalary += staff.getSalary();
        }
        // double averageSalary = Math.round((sumSalary / staffs.length) * 100.0) / 100.0;
        return sumSalary / staffs.length;
    }
    public static void staffsFulltimeSalaryLower(Staff[] staffs) {
        int count = 0;
        for (Staff staff : staffs) {
            if (staff.getSalary() < averageSalary(staffs) && staff instanceof StaffFulltime) {
                System.out.println(staff);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No salary lower than average salary!");
        } else {
            System.out.println("The number of people whose salary is lower than the average salary is: " + count);
        }
    }
    public static void totalParttimeSalary(Staff[] staffs) {
        double sumSalaryParttime = 0;
        for (Staff staff : staffs) {
            if (staff instanceof StaffParttime) {
                sumSalaryParttime += staff.getSalary();
            }
        }
        System.out.println("Total part-time salary is: " + String.format("%.0f", sumSalaryParttime) + "VNĐ");
    }
    public static void arrangeStaffFulltimeBySalary(Staff[] staffs) {
        Comparator<Staff> staffComparator = new StaffComparator();
        Arrays.sort(staffs, staffComparator);
        for (Staff staff : staffs) {
            if (staff instanceof StaffFulltime) {
                System.out.println(staff);
            }
        }
    }
}