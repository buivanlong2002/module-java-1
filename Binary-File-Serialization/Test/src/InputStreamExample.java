import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\minht\\Desktop\\CodeGym Module2\\Binary-File-Serialization\\Test\\input.txt");
        byte[] bytes = new byte[10];
        int i;
        while ((i = in.read(bytes)) != -1) {
            String str = new String(bytes, 0, i);
            System.out.print("Read " + i + " char: " + str + "\n");
        }
        in.close();
    }
}
