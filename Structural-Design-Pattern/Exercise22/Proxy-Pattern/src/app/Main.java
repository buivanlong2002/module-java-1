package app;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        String url = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf";
        String destination = "downloaded_dummy.pdf";

        client.downloadFile(url, destination);
    }
}
