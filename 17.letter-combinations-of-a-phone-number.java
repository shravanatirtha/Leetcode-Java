/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    private static final String[] keypad = { "-", "-", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        combination("", digits, 0, result);
        return result;
    }

    private void combination(String s, String digits, int index, List<String> result) {
        if (digits == null || digits.length() == 0)
            return;
        else if (index >= digits.length()) {
            result.add(s);
            return;
        } else {
            String letters = keypad[digits.charAt(index) - '0'];
            for (int i = 0; i < letters.length(); i++)
                combination(s + letters.charAt(i), digits, index + 1, result);
        }
    }
}
// @lc code=end
