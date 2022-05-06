import java.util.Arrays;

/*
 * @lc app=leetcode id=1209 lang=java
 *
 * [1209] Remove All Adjacent Duplicates in String II
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s, int k) {
        int i = 0, n = s.length(), count[] = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) i -= k;
        }
        return new String(stack, 0, i);
        // int alphabets[] = new int[26];
        // Arrays.fill(alphabets, 0);
        // for (int i = 0; i < s.length(); i++) {
        //     int count = (int) s.charAt(i) - 97;
        //     alphabets[count] = count + 1;
        // }
        // String result = "";
        // for (int i = 0; i < 26; i++) {
        //     if (alphabets[i] > 0 && alphabets[i] < k)
        //         result = result + (char) alphabets[i];
        // }
        // return result;
    }
}
// @lc code=end
