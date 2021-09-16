/*
 * @lc app=leetcode.cn id=678 lang=java
 *
 * [678] 有效的括号字符串
 */

// @lc code=start
class Solution {
    public boolean checkValidString(String s) {
        int left = 0, right = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                left++; 
                right++;
            } else if (c == ')') {
                left--; 
                right--;
            } else {
                left--; 
                right++;
            }
            left = Math.max(left, 0);
            if (left > right) 
                return false;
        }
        return left == 0;
    }
}
// @lc code=end

