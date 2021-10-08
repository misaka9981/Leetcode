import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution187_1 {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i + 10 <= n; i++) {
            String cur = s.substring(i, i + 10);
            int num = map.getOrDefault(cur, 0);
            if (num == 1) ans.add(cur);
            map.put(cur, num + 1);
        }
        return ans;
    }
}