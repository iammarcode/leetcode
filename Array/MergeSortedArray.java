package Array;

// https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class MergeSortedArray {
    // Solution1 Time O(n) 
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1;
        int tail2 = n - 1;
        int current = m + n - 1;

        while (tail2 >= 0) {
            if (tail1 >= 0) {
                nums1[current--] = nums1[tail1] > nums2[tail2] ? nums1[tail1--] : nums2[tail2--];
            } else {
                nums1[current--] = nums2[tail2--];
            }
        }
    }
}