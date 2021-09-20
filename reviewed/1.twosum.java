import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
//两次循环，暴力搜索找到与target相符的index
class Solution1_1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target ) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
//map[数组元素(key)，数组下标(value)]，如map不存在target-num[i]的value，添加num[i]和下标i；
//如存在，则返回target-nump[i]和下标i
class Solution1_2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no solution");
    }
}
// @lc code=end

