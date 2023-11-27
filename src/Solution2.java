import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int frequency : frequencyMap.values()) {
            count += frequency * (frequency - 1) / 2;
        }

        return count;
    }
}