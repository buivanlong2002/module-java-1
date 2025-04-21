public class MyMapTest {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();

        System.out.println("Put A: " + map.put("A", 10));
        System.out.println("Put B: " + map.put("B", 20));
        System.out.println("Put C: " + map.put("C", 20));
        System.out.println("Put A again: " + map.put("A", 15));

        System.out.println("Get A: " + map.get("A"));
        System.out.println("Get B: " + map.get("B"));
        System.out.println("Get C: " + map.get("C"));
        System.out.println("Get D: " + map.get("D"));

        System.out.println("Contains key B: " + map.containsKey("B"));
        System.out.println("Contains value 11: " + map.containsValue(11));

        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());

        System.out.println("Remove B: " + map.remove("B"));
        System.out.println("Remove B again: " + map.remove("B"));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        System.out.println("Iterate through entries:");
        for (Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.key + " = " + e.value);
        }

        System.out.println("Iterate through keys:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        map.clear();
        System.out.println("Is empty after clear: " + map.isEmpty());
    }
}