package exception;

public class TaxiNotFoundException extends RuntimeException {
    public TaxiNotFoundException(String message) {
        super(message); // dùng super thay vì println để giữ chuẩn Exception
        System.out.println(message);
    }
}
