class Solution573_1 {
    public int findMinMoves(int[] machines) {
        int total = 0;
        for (int machine : machines) {
            total += machine;
        }
        int n = machines.length;
        if (total % n != 0) return -1;
        // 得到平均后每个洗衣机内的衣服数量
        int avg = total / n;
        int[] helper = new int[n];
        // 得到还需要的衣服数量的数组
        for (int i = 0; i < n; i++) {
            helper[i] = machines[i] - avg;
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, Math.abs(helper[i]));
            ans = Math.max(ans, helper[i + 1]);
            helper[i + 1] += helper[i];
        }
        return Math.max(ans, helper[n - 1]);
    }
}