
import java.io.*;

public class JavaIODemo {

    public static void main(String[] args) {

        // 1. Tạo và kiểm tra tệp
        File file = new File("testfile.txt");
        if (file.exists()) {
            System.out.println("Tệp tồn tại.");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Tạo tệp thành công.\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 2. Đọc và ghi dữ liệu từ tệp văn bản
        // Ghi vào tệp
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Hello, Java IO!\n");
            writer.write("This is an example of BufferedWriter.\n");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc từ tệp
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Đọc và ghi dữ liệu nhị phân
        try (FileInputStream fis = new FileInputStream("sourcefile.dat");
             FileOutputStream fos = new FileOutputStream("destinationfile.dat")) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Sao chép tệp thành công.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. Sử dụng PrintWriter để ghi dữ liệu có định dạng
        try (PrintWriter writer = new PrintWriter(new FileWriter("formatted_output.txt"))) {
            writer.println("Hello, this is a formatted message.");
            writer.printf("Integer: %d, Double: %.2f%n", 100, 3.14159);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. Serialize và Deserialize đối tượng
        // Lớp định nghĩa đối tượng để serialize
        class Person implements Serializable {
            private final String name;
            private final int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Name: " + name + ", Age: " + age;
            }
        }

        // Serialize đối tượng
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            Person person = new Person("Marco", 36);
            oos.writeObject(person);
            System.out.println("Đối tượng đã được serialize.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize đối tượng
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Đối tượng đã được deserialize: " + person + "\n");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 6. Xóa tệp
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Tệp đã được xóa.\n");
            } else {
                System.out.println("Không thể xóa tệp.");
            }
        } else {
            System.out.println("Tệp không tồn tại.");
        }

        // 7. Đọc và ghi tệp văn bản đơn giản bằng FileReader và FileWriter
        try (FileWriter writer = new FileWriter("simple_output.txt")) {
            writer.write("Hello, this is a simple text file.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("simple_output.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
