import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution720_1 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        //对数组排序，Set存字母，小的单次一定包含在大的单词中，取前缀相同
        //
        Set<String> set = new HashSet<>();
        String res = "";
        for(String s:words) {
            if(s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
                res = s.length() > res.length() ? s : res;
                set.add(s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution720_1 s = new Solution720_1();
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String res = s.longestWord(words);
    }
}