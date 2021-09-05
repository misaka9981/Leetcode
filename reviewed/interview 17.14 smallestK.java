import java.util.Arrays;
import java.util.PriorityQueue;

//using Arrays util
class Solution1 {
    public int[] smallestK(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
//using PriorityQueue
class Solution2 {
    public int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i : arr) {
            p.add(i);
        }
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = p.poll();
        }
        return ans;
    }
}