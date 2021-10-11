class Solution29_1 {
    public int divide(int dividend, int divisor) {
        long A = dividend;
        long B = divisor;

        boolean neg = (A > 0) != (B > 0);
        A = (A < 0) ? -A : A;
        B = (B < 0) ? -B : B;

        // 二分法
        long l = 0, r = A;
        while (l < r) {
            long mid = l + ((r - l) >> 1);
            if (mid * B <= A) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        // 判断结果是否要减1
        if (l * B > A) l--;

        // 返回值的符号与溢出处理
        l = (neg ? -l : l);
        if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) l;
    }
}