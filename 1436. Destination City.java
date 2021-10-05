import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1436_1 {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (List<String> list : paths)
            map.put(list.get(0), 1);
        for (List<String> list : paths)
            if (map.get(list.get(1)) == null)
                return list.get(1);
        return null;
    }
}