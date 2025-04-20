import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Queue;

public class QueueManager {

    public static void classifyEmployees(List<Employee> employees, Queue<Employee> femaleQueue, Queue<Employee> maleQueue) {
        for (Employee employee : employees) {
            if (employee.getGender().equalsIgnoreCase("Female")) {
                femaleQueue.offer(employee);
            } else {
                maleQueue.offer(employee);
            }
        }
    }

    // Ghi các bản ghi vào file output
    public static void writeToFile(Queue<Employee> femaleQueue, Queue<Employee> maleQueue, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Ghi dữ liệu từ Queue NU (Nữ)
            while (!femaleQueue.isEmpty()) {
                writer.write(femaleQueue.poll().toString());
                writer.newLine();
            }

            // Ghi dữ liệu từ Queue NAM (Nam)
            while (!maleQueue.isEmpty()) {
                writer.write(maleQueue.poll().toString());
                writer.newLine();
            }

            System.out.println("Dữ liệu đã được ghi vào file " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}