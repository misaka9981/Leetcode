/*
 * @lc app=leetcode.cn id=1894 lang=java
 *
 * [1894] 找到需要补充粉笔的学生编号
 */

// @lc code=start
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int len = chalk.length;
        int sum = 0;
        for (int num : chalk) {
            sum += num;
        }
        k = k % sum;
        int res = -1;
        for (int i = 0; i < len; ++i) {
            if (chalk[i] > k) {
                res = i;
                break;
            }
            k -= chalk[i];
        }
        return res;
    }
}
// @lc code=end

