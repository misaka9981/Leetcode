import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;
/*
 * @lc app=leetcode.cn id=502 lang=java
 *
 * [502] IPO
 */

// @lc code=start
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{capital[i], profits[i]});
        }
        Collections.sort(list, (a,b)->a[0]-b[0]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        int i = 0;
        while (k-- > 0) {
            while (i < n && list.get(i)[0] <= w) q.add(list.get(i++)[1]);
            if (q.isEmpty()) break;
            w += q.poll();
        }
        return w;
    }
}
// @lc code=end

