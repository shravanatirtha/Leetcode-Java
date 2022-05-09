/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return (nums1[nums1.length/2]+nums2[nums2.length/2])/2;
    }
}
// @lc code=end

