package Array;

// https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
public class JumpGame {
    // backtracking
    public boolean solution1(int[] nums) {
        int lastReachablePostion = nums.length-1;

        for (int i = nums.length-1; i >= 0; i--) {
            if (i+nums[i]>=lastReachablePostion) {
                lastReachablePostion = i;
            }
        }

        return lastReachablePostion == 0 ? true : false;
    }

}
