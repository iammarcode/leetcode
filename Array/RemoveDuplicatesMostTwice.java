package Array;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesMostTwice {
    // My solution
    public int solution1(int[] nums) {
        int k = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
                count = 1;
            } else if (count < 2) {
                nums[++k] = nums[i];
                count++;
            }
        }

        return k + 1;
    }

    // Best solution
    public int solution2(int[] nums) {
        int k = 0;

        for (int n : nums) {
            if (k < 2 || n != nums[k - 2]) {
                nums[k++] = n;
            }
        }

        return k;
    }
}
