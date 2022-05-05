/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int n = s.length();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end
