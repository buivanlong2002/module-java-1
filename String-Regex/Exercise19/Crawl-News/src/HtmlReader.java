import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlReader {
    public static String getHtml(String urlString) {
        StringBuilder html = new StringBuilder();
        try {
            URL url = new URL(urlString);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream(), "UTF-8"));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                html.append(inputLine).append("\n");
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return html.toString();
    }
}