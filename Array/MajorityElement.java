package Array;

import java.util.Arrays;
import java.util.HashMap;

class MajorityElement {
    // HashMap
    public int solution1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int half = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else if (map.get(n) > (half - 1)) {
                return n;
            } else {
                map.put(n, map.get(n) + 1);
            }
        }

        return -1;
    }

    // Array.sort()
    public int solution2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Moore Voting Algorithm
    public int solution3(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }

            if (candidate == i) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}