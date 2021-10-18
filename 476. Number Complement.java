class Solution476_1 {
    public int findComplement(int num) {
        int n = 1;
        while(n < num){
            n = (n<<1)+1;
        }
        return n - num;
    }

    public static void main(String[] args) {
        Solution476_1 s = new Solution476_1();
        s.findComplement(5);
    }
}