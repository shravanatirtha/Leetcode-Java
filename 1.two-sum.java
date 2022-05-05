/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target)
                break;
            else if (nums[start] + nums[end] < target)
                start++;
            else if (nums[start] + nums[end] > target)
                end--;
        }
        return new int[] { start, end };
    }
}
// @lc code=end
