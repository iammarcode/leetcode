package Array;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class removeDuplicates {
    // My solution
    // Time O(n)
    // Space O(1)
    public int solution1(int[] nums) {
        int index = 0;
        int dup = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != dup) {
                nums[++index] = nums[i];
                dup = nums[i];
            }
        }

        return index + 1;
    }

    // Best practice
    // Time O(n)
    // Space O(1)
    public int solution2(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }
}