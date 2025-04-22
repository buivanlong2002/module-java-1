public class MyMapTest {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();

        System.out.println("Put Marco: " + map.put("Marco", 10));
        System.out.println("Put Tran: " + map.put("Tran", 20));
        System.out.println("Put Hoang: " + map.put("Hoang", 20));
        System.out.println("Put Marco again: " + map.put("Marco", 15));
        System.out.println("Put null: " + map.put(null, 20));
        System.out.println("Put null: " + map.put(null , 30));
        System.out.println("Put Hoa: " + map.put("Hoa", null));
        System.out.println("Put Hog: " + map.put("Hog", null));

        System.out.println("Get Marco: " + map.get("Marco"));
        System.out.println("Get Tran: " + map.get("Tran"));
        System.out.println("Get Hoang: " + map.get("Hoang"));
        System.out.println("Get Reus: " + map.get("Reus"));

        System.out.println("Contains key Tran: " + map.containsKey("Tran"));
        System.out.println("Contains value 11: " + map.containsValue(11));

        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());

        System.out.println("Remove Tran: " + map.remove("Tran"));
        System.out.println("Remove Tran again: " + map.remove("Tran"));

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