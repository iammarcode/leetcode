package Array;

// https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
class RotateArray {
    // Best solution
    public void solution1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (end > start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
}
