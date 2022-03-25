import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Solution2100_1 {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        if(security.length <= time*2) return null;
//        List<Integer> left = new ArrayList<>();
//        List<Integer> right = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        int[] left = new int[security.length];
        int[] right = new int[security.length];
//        int[] res = new int[security.length];
        for (int i = 1;i < security.length;i++)
            if (security[i-1] >= security[i]){
                left[i] = left[i-1] + 1;
            }
        for(int i=security.length-2;i>=0;i--)
            if(security[i] <= security[i+1])
                right[i] = right[i+1] + 1;
        for(int i=0;i<security.length;i++)
            if(left[i]>= time && right[i] >= time)
                res.add(i);
        return res;

    }
}