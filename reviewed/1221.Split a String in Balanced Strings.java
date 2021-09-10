/*
 * @lc app=leetcode.cn id=1221 lang=java
 *
 * [1221] 分割平衡字符串
 */

// @lc code=start
class Solution2 {
    public int balancedStringSplit(String s) {
        int n = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                n++;
            }if(s.charAt(i) == 'L'){
                n--;
            }if(n == 0){
                num++;
            }
        }
        return num;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        Solution2 solution = new Solution2();
        // Create a test case
        String s = "RLRRLLRLRL";
        int answer = solution.balancedStringSplit(s);
        // Print the answer
        System.out.println(answer);
    }
}
// @lc code=end

