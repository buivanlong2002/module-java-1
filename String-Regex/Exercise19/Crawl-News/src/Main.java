public class Main {
    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";
        String html = HtmlReader.getHtml(url);
        NewsExtractor.extractTitles(html);
    }
}