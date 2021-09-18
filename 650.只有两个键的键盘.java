/*
 * @lc app=leetcode.cn id=650 lang=java
 *
 * [650] 只有两个键的键盘
 */

// @lc code=start
class Solution {
    public int minSteps(int n) {
        if(n == 1) return 0;
        int res = n;
        for(int i = 2;i <= Math.sqrt(n);++i){
            if(n%i == 0){
                res = Math.min(res,minSteps(n/i)+i);
            }
        }
        return res;
    }
}
// @lc code=end

