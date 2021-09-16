/*
 * @lc app=leetcode.cn id=600 lang=java
 *
 * [600] 不含连续1的非负整数
 */

// @lc code=start
class Solution {
    public int findIntegers(int n) {
        return dfs(0,0,false,n);
    }

    public int dfs(int i,int num,boolean pre,int target){
        if(num>target)return 0;
        if(1<<i>target)return 1; 
        if(pre){
            return dfs(i+1,num,false,target);
        }
        return dfs(i+1,num,false,target)+dfs(i+1,num+(1<<i),true,target);
    }
}

// class Main {
//     public static void main(String[] args) {
//         // Create a new Solution instance
//         Solution2 solution = new Solution2();
//         // Create a test case
//         int x = 6;
//         int answer = solution.findIntegers(x);
//         // Print the answer
//         //System.out.println(answer);
//     }
// }
// @lc code=end

