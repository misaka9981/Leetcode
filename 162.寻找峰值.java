/*
 * @lc app=leetcode.cn id=162 lang=java
 *
 * [162] 寻找峰值
 */

// @lc code=start
class Solution2 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        for (; left < right; ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        Solution2 solution = new Solution2();
        // Create a test case
        int[] x = new int[]{1,2,1,3,5,6,4};
        int answer = solution.findPeakElement(x);
        // int[][] x = {{0,0},{1,0},{2,0}};
        // int answer = solution.numberOfBoomerangs(x);
        // Print the answer
        //System.out.println(answer);
        System.out.println(answer);
    }
}
// @lc code=end

