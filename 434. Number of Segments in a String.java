class Solution434_1 {
    public int countSegments(String s) {
        int res = 0;
        for (String t : s.split(" ")) {
            if (!"".equals(t)) {
                ++res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution434_1 s = new Solution434_1();
        int ans = s.countSegments("");
    }
}