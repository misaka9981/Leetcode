import java.util.Arrays;

class P673 {
    public static void main(String[] args) {
         // Create a new Solution instance
         Solution33 solution = new Solution33();
         // Create a test case
         int[] x = new int[] {1,3,5,4,7};
         int answer = solution.findNumberOfLIS(x);
         // Print the answer
         //System.out.println(answer)
    }
}

class Solution33 {
    public int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        if(len <= 1) return len;
        int[] count = new int[len];
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);

        int maxCount = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
                if (dp[i] > maxCount) maxCount = dp[i];
            }
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            if (maxCount == dp[i]) res += count[i];
        }
        return res;
    }
}

