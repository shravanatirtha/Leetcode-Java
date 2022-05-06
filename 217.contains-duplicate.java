import java.util.*;
import java.util.stream.*;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
       List<Integer> list=Arrays.stream(nums)
       .boxed()
       .collect(Collectors.toList());
        HashSet<Integer> set= new HashSet<>(list);
        return set.size()==list.size();
    }
}
// @lc code=end

