

class Solution583_1 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        //dp[i][j]表示word1[0...i - 1]与word2[0...j-1]的最大公共子序列长度
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return m + n - 2 * dp[m][n];
    }

    public static void main(String[] args) {
        // Create a new Solution instance
        Solution583_1 solution = new Solution583_1();
        // Create a test case
        String word1 = "eat";
        String word2 = "sat";
        int answer = solution.minDistance(word1,word2);
        // Print the answer
        System.out.println(answer);
    }
}
