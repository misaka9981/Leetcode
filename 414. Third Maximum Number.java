import java.util.Set;
import java.util.TreeSet;

class Solution414_1 {
    public int thirdMax(int[] nums) {
        Set s=new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        Object[] o=s.toArray();
        if (s.size()<3){
            return (Integer)o[o.length-1];
        }
        return (Integer)o[o.length-3];
    }

    public static void main(String[] args) {
        // Create a new Solution instance
        Solution414_1 solution = new Solution414_1();
        // Create a test case
        int[] x = new int[]{2, 2, 3, 1};
        int answer = solution.thirdMax(x);
        // int[][] x = {{0,0},{1,0},{2,0}};
        // int answer = solution.numberOfBoomerangs(x);
        // Print the answer
        //System.out.println(answer);
        System.out.println(answer);
    }
}