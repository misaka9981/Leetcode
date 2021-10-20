import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution453_1 {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = getMin(nums);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] - min;
        }
        return sum;
    }
    public static int getMin(int[] nums){
        IntStream stream = Arrays.stream(nums);
        Stream<Integer> integerStream = stream.boxed();
        Integer[] integers = integerStream.toArray(Integer[]::new);
        return (int) Collections.min(Arrays.asList(integers));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(getMin(arr));
    }
}