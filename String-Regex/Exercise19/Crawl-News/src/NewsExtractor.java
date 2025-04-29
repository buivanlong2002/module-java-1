import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsExtractor {
    public static void extractTitles(String html) {
        String patternString = "<h3 class=\"article-title\">\\s*<a[^>]*>(.*?)</a>";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(html);

        int count = 0;
        while (matcher.find()) {
            count++;
            String title = matcher.group(1).replaceAll("<[^>]+>", ""); // xóa các thẻ HTML phụ bên trong nếu có
            System.out.println(count + ". " + title);
        }
    }
}
