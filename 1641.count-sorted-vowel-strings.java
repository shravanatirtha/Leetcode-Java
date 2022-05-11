/*
 * @lc app=leetcode id=1641 lang=java
 *
 * [1641] Count Sorted Vowel Strings
 */

// @lc code=start
class Solution {
    public int countVowelStrings(int n) {
        // (n + 1) * (n + 2) * (n + 3) * (n + 4) / 4!
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }
}
// @lc code=end 
