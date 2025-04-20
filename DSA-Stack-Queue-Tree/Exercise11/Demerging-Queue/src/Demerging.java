import java.util.*;

public class Demerging {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Nguyen Thi Lan", "Female", "15/02/1990"),
                new Employee("Tran Minh Tu", "Male", "10/05/1985"),
                new Employee("Le Thi Lan", "Female", "20/06/1992"),
                new Employee("Pham Tuan Anh", "Male", "25/12/1991")
        );

        Queue<Employee> femaleQueue = new LinkedList<>();
        Queue<Employee> maleQueue = new LinkedList<>();

        QueueManager.classifyEmployees(employees, femaleQueue, maleQueue);

        QueueManager.writeToFile(femaleQueue, maleQueue, "output.txt");
    }
}