import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:\\Users\\minht\\Desktop\\CodeGym " +
                "Module2\\Binary-File-Serialization\\Test\\output.txt", true);
        byte[] buf = new byte[] { 'a', 'b', 'c', 'd', 'e', 'f' , '\r', '\n'};
        for (byte b : buf) {
            os.write(b);
        }
        os.close();
    }
}
