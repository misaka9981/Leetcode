/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution7_1 {
    public int reverse(int x) {
        int res = 0;
        int last = 0;
        while(x!=0) {
            int tmp = x%10;
            last = res;
            res = res*10 + tmp;
            if(last != res/10)
            {
                return 0;
            }
            x /= 10;
        }
        return res;
    }    
}

//class Main {
//    public static void main(String[] args) {
//        // Create a new Solution instance
//        Solution2 solution = new Solution2();
//        // Create a test case
//        int x = 12345;
//        int answer = solution.reverse(x);
//        // Print the answer
//        System.out.println(answer);
//    }
//}

// @lc code=end

