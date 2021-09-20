/*
 * @lc app=leetcode.cn id=292 lang=java
 *
 * [292] Nim 游戏
 */

// @lc code=start
class Solution292_1 {
    public boolean canWinNim(int n) {
        if(n < 4){
            return true;
        }else if(n == 4){
            return false;
        }
        return canWinNim(n-4);
    }
}
// @lc code=end

