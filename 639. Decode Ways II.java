class Solution639_1 {
    public int numDecodings(String s) {
        return dfs(s, 0, 0, new Integer[s.length()][3]);
    }

    private int dfs(String s, int curIndex, int preState, Integer[][] memory) {
        // preState是前面的状态, 1代表前面是1 2代表前面是2 0代表其他
        if (curIndex >= s.length()) {
            return 1;
        }
        if (memory[curIndex][preState] != null) {
            return memory[curIndex][preState];
        }

        int mod = 1000000007;
        int returnResult = 0;
        char ch = s.charAt(curIndex);

        if (preState == 0 && ch == '0') {
            // 如果没法和前面组合, 这一组合是无效的
            return 0;
        }

        // 1.与前面一同解码, 不会影响后面(只有preState为1和2的时候才有下面)
        long temp;
        if (preState == 1) {
            temp = dfs(s, curIndex + 1, 0, memory);
            if (ch == '*') {
                temp = (temp << 3) + temp;
            }
            returnResult = (int) ((returnResult + temp) % mod);
        } else if (preState == 2 && (ch < '7')) {
            // ch等于'*'的时候也小于'7'
            temp = dfs(s, curIndex + 1, 0, memory);
            if (ch == '*') {
                temp = (temp << 2) + (temp << 1);
            }
            returnResult = (int) ((returnResult + temp) % mod);
        }

        // 2.此时当前数选择不和前面组合但尝试和后面组合
        if (preState == 0 && (ch == '1' || ch == '*') && curIndex + 1 < s.length()) {
            // 可以作为1x
            returnResult =  (returnResult + dfs(s, curIndex + 1, 1, memory)) % mod;
        }
        if (preState == 0 && (ch == '2' || ch == '*') && curIndex + 1 < s.length()) {
            // 可以作为2x
            returnResult =  (returnResult + dfs(s, curIndex + 1, 2, memory)) % mod;
        }

        // 3.不和前面也不和后面组合
        if (preState == 0) {
            temp = dfs(s, curIndex + 1, 0, memory);
            if (ch == '*') {
                // 9种情况与后面的组合
                temp = (temp << 3) + temp;
            }
            returnResult = (int) ((returnResult + temp) % mod);
        }
        memory[curIndex][preState] = returnResult;
        return returnResult;
    }
}