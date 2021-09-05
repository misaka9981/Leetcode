/*
 * @lc app=leetcode.cn id=165 lang=java
 *
 * [165] 比较版本号
 */

// @lc code=start
//using split
class Solution1 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for (int i = 0; i < v1.length || i < v2.length; i++) {
            int x = 0 , y = 0;
            if (i < v1.length) {
                x = Integer.parseInt(v1[i]);
            }
            if (i < v2.length) {
                y = Integer.parseInt(v2[i]);
            }
            if (x > y) {
                return 1;
            }
            if (x < y) {
                return -1;
            }
        }
        return 0;
    }
}
//using double pointer
class Solution3 {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length(),len2 = version2.length(),cur1 = 0,cur2 = 0,v1 = 0,v2 = 0;
        while (cur1 < len1 ||  cur2 < len2) {
            while (cur1 < len1 && version1.charAt(cur1) != '.') {
                char c1 = version1.charAt(cur1);
                v1 = v1 * 10 + c1 - '0';
                cur1++;
            }
            while (cur2 < len2 && version2.charAt(cur2) != '.') {
                char c2 = version2.charAt(cur2);
                v2 = v2 * 10 + c2 - '0';
                cur2++;
            }
            if (v1 != v2) return v1 > v2 ? 1 : -1;
            v1 = v2 = 0;
            cur1++;
            cur2++;
        }
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        Solution3 solution = new Solution3();
        // Create a test case
        String version1 = "7.5.3.3", version2 = "7.5.3.5";
        int answer = solution.compareVersion(version1,version2);
        // Print the answer
        System.out.println(answer);
    }
}
// @lc code=end

