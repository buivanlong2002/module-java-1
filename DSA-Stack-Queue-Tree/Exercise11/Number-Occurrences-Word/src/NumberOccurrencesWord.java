import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class NumberOccurrencesWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] words = input.trim().toLowerCase().split("\\s+");
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println("The word and number of occurrences in string: ");
//        for (Map.Entry<String, Integer> key : map.entrySet()) {
//            System.out.println(key.getKey() + " : " + key.getValue());
//        }

        for (String word : map.keySet()) {
            int countWord = map.get(word);
            System.out.println(word + " : " + countWord);
        }
    }
}