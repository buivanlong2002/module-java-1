import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Marco", 20);
        hashMap.put("Reus", 36);
        hashMap.put("Hoang", 22);
        hashMap.put("Kwang", 30);
        hashMap.put("Soo", 40);
        System.out.println("Display HasMap: " + hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display TreeMap: " + treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Marco", 20);
        linkedHashMap.put("Reus", 36);
        linkedHashMap.put("Hoang", 22);
        linkedHashMap.put("Kwang", 30);
        linkedHashMap.put("Soo", 40);
        System.out.println("Display LinkedHashMap: " + linkedHashMap + "\n");
        System.out.println("The age for " + "Reus is " + linkedHashMap.get("Reus") + "\n");
        System.out.println("Display LinkedHashMap: " + linkedHashMap + "\n");
    }
}