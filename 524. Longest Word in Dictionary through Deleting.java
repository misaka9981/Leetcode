import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
/*
 * @lc app=leetcode.cn id=524 lang=java
 *
 * [524] 通过删除字母匹配到字典里最长单词
 */

// @lc code=start
class Solution524_1 {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, new SortByLengthComparator());
        for (String t : dictionary) {
            int i = 0, j = 0;
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) {
                    ++i;
                }
                ++j;
            }
            if (i == t.length()) {
                return t;
            }
        }
        return "";
    }
}

class SortByLengthComparator implements Comparator<String> {
	@Override
	public int compare(String var1, String var2) {
		if (var1.length() != var2.length()) {
            return var2.length() - var1.length();
        } else {
            return var1.compareTo(var2);
        }
	}
}

// class Main {
//     public static void main(String[] args) {
//         // Create a new Solution instance
//         Solution2 solution = new Solution2();
//         // Create a test case
//         List<String> list = new ArrayList<String>();
//         String[] dictionary = {"ale","apple","monkey","plea"};
//         for (String string : dictionary) {
//             list.add(string);
//         }
//         String answer = solution.findLongestWord("abpcplea", list);
//         // int[][] x = {{0,0},{1,0},{2,0}};
//         // int answer = solution.numberOfBoomerangs(x);
//         // Print the answer
//         //System.out.println(answer);
//         System.out.println(list);
//     }
// }
// @lc code=end

