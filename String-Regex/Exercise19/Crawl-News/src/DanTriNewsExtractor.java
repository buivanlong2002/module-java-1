import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DanTriNewsExtractor {

    public static void main(String[] args) {
        try {
            String urlString = "https://dantri.com.vn/the-gioi.htm";
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            StringBuilder htmlBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                htmlBuilder.append(line);
            }
            reader.close();

            String html = htmlBuilder.toString();

            Pattern pattern = Pattern.compile(
                    "<h3 class=\"article-title\">\\s*<a[^>]*href=\"([^\"]+)\"[^>]*>(.*?)</a>",
                    Pattern.CASE_INSENSITIVE | Pattern.DOTALL
            );
            Matcher matcher = pattern.matcher(html);

            System.out.println("Danh sách bản tin từ Dân Trí (thế giới): \n");
            int count = 0;
            while (matcher.find()) {
                count++;
                String link = "https://dantri.com.vn" + matcher.group(1).trim();
                String title = matcher.group(2).replaceAll("<[^>]+>", "").trim(); // xóa thẻ HTML phụ nếu có
                System.out.println(count + ". " + title);
                System.out.println("   🔗 " + link);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
