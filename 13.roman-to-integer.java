/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char prev = 0;
            if (i != 0)
                prev = s.charAt(i - 1);
            switch (c) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    if (prev == 'I')
                        result -= 2;
                    break;
                case 'X':
                    result += 10;
                    if (prev == 'I')
                        result -= 2;
                    break;
                case 'L':
                    result += 50;
                    if (prev == 'X')
                        result -= 20;
                    break;
                case 'C':
                    result += 100;
                    if (prev == 'X')
                        result -= 20;
                    break;
                case 'D':
                    result += 500;
                    if (prev == 'C')
                        result -= 200;
                    break;
                case 'M':
                    result += 1000;
                    if (prev == 'C')
                        result -= 200;
                    break;
            }
        }
        return result;
    }
}
// @lc code=end
