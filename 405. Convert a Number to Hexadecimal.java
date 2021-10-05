class Solution405_1 {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder str = new StringBuilder();
        for (int shift = 28; shift >= 0; shift -= 4) {
            int n = (num >> shift) & 15;
            if (str.length() > 0 || n != 0)
                str.append(map[n]);
        }
        return str.toString();
    }
}