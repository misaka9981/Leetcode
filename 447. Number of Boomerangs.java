import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 */

// @lc code=start
class Solution447_1 {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            Set<Integer> set = new HashSet<>();
            Map<Integer,Integer> map = new HashMap<>();
            for (int j = 0;j< points.length;j++){
                if (i==j){
                    continue;
                }
                int x = points[j][0] - points[i][0];
                int y = points[j][1] - points[i][1];
                if (!set.add((x*x)+(y*y))){
                    if (map.get((x*x)+(y*y))==null){
                        map.put((x*x)+(y*y),2);
                    }else {
                        map.put((x*x)+(y*y),map.get((x*x)+(y*y))+1);
                    }
                }
            }
            for (Integer value : map.values()) {
                result += (value*(value-1));
            }
        }
        return result;
    }
}

// class Main {
//     public static void main(String[] args) {
//         // Create a new Solution instance
//         Solution2 solution = new Solution2();
//         // Create a test case
//         int[][] x = {{0,0},{1,0},{2,0}};
//         int answer = solution.numberOfBoomerangs(x);
//         // Print the answer
//         //System.out.println(answer);
//     }
// }
// @lc code=end

