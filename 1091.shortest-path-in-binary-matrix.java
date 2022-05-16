import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=1091 lang=java
 *
 * [1091] Shortest Path in Binary Matrix
 */

// @lc code=start
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1)
            return -1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { 0, 1 });
        grid[0][0] = 2;
        int[][] dirs = { { 1, 0 }, { 1, -1 }, { 1, 1 }, { 0, 1 }, { 0, -1 }, { -1, 0 }, { -1, 1 }, { -1, -1 } };
        int n = grid.length;
        while (!q.isEmpty()) {
            int[] current = q.poll();
            if (current[0] == n * n - 1)
                return current[1];
            for (int i = 0; i < 8; i++) {
                int nx = current[0] / n + dirs[i][0];
                int ny = current[0] % n + dirs[i][1];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n || grid[nx][ny] != 0)
                    continue;
                q.offer(new int[] { nx * n + ny, current[1] + 1 });
                grid[nx][ny] = 2;
            }
        }
        return -1;
    }
}
// @lc code=end
