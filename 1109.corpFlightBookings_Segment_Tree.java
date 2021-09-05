/*
 * @lc app=leetcode.cn id=1109 lang=java
 *
 * [1109] 航班预订统计
 */


// @lc code=start
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans[] = new int[n];
        for (int[] record : bookings) {
            for (int i = record[0]; i <= record[1]; i++) {
                ans[i - 1] += record[2];
            }
        }
        return ans;
    }
}
// @lc code=end

