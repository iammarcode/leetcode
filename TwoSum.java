import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Time: O(n^2)
        // Space: O(1)
//         for(int i=0; i<nums.length; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 if(nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return null;

        // Time: O(n)
        // Space: O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int x = target - cur;
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(cur, i);
        }
        return null; // compiler satisfaction
    }
}
