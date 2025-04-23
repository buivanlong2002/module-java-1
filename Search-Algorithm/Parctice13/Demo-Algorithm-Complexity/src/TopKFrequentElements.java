import java.util.*;
public class TopKFrequentElements {
    public static List<Integer> topKFrequent(List<Integer> nums, int k) {
        // Bước 1: Đếm tần suất
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Bước 2: Tạo một min-heap theo tần suất
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        // Bước 3: Giữ trong heap k phần tử có tần suất cao nhất
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        // Bước 4: Trích xuất kết quả
        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty()) {
            result.add(heap.poll().getKey());
        }
        // Nếu bạn cần kết quả ngược thứ tự, có thể đảo list
        // Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 1, 1, 2, 2, 3);
        int k = 2;
        System.out.println(topKFrequent(nums, k)); // Output: [1, 2]
    }
}