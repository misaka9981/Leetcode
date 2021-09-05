/*
 * @lc app=leetcode.cn id=1109 lang=java
 *
 * [1109] 航班预订统计
 */


// class Main {
//     public static void main(String[] args) {
//         // Create a new Solution instance
//         Rolution solution = new Rolution();
//         // Create a test case
//         int[][] testCase = {{1,2,10},{2,3,20},{2,5,25}};
//         // Get the answer
//         int[] answer = solution.corpFlightBookings(testCase,5);
//         // Print the answer
//         System.out.println(answer);
//     }
// }
// @lc code=start
class Rolution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] counters = new int[n];
        for (int[] booking : bookings) {
            counters[booking[0] - 1] = counters[booking[0] - 1] + booking[2];
            if (booking[1] < n) {
                counters[booking[1]] = counters[booking[1]] - booking[2]; 
            }
        }
        for (int i = 1; i < n; i++) {
            counters[i] += counters[i - 1];
        }
        return counters;
        
    }
}
// @lc code=end

