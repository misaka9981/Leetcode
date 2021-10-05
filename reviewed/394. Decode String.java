package reviewed;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */


// @lc code=start
class Solution394_1 {
    public String decodeString(String s) {
        char[] s2a = s.toCharArray();
        int len = s.length();
        int num = 0;
        Deque<Integer> q_num = new ArrayDeque<>();
        Deque<String> q_str = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            char c = s2a[i];
            if (c == '['){ 
                q_num.push(num);
                num = 0;
                q_str.push("[");
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                while (!q_str.isEmpty() && q_str.peek() != "[") { 
                    temp.append(q_str.poll());
                }
                q_str.poll();
                int k = q_num.poll(); 
                for (int j = 0; j < k; j++) {
                    q_str.push(temp.toString());
                }
            } else if (Character.isDigit(c)) { 
                num = num * 10 + s2a[i] - '0'; 
            } else {
                StringBuilder temp = new StringBuilder();
                while (i < len && Character.isLetter(s2a[i])) { //反着放入这对括号的字符到栈内
                    temp.append(s2a[i++]);
                }
                q_str.push(temp.reverse().toString());
                i--;
            }
        }
        StringBuilder res = new StringBuilder();
        while (!q_str.isEmpty()) {
            res.append(q_str.poll());
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        // Create a new Solution instance
        Solution394_1 solution = new Solution394_1();
        // Create a test case
        String str = "3[a]2[bc]";
        String answer = solution.decodeString(str);
        // Print the answer
        System.out.println(answer);
    }
}


// @lc code=end

