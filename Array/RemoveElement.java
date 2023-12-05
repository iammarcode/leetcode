package Array;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
class RemoveElement {
    // Time O(2n)
    // Space O(2)
    public int solution1(int[] nums, int val) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < result.size() ) {
                nums[i] = result.get(i);
            }
        }

        return result.size();
    }

    // Two pointers
    // Time O(n)
    // Space O(1)
    public int solution2(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}

