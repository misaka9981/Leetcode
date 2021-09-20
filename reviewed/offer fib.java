//直接使用递归式，时间复杂度较高
class Solution_offerFib_2 {
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
//将冗余的计算存储为额外的数组，有一定的空间复杂度
class Solution_offerFib_1 {
    public int fib(int n) {
        int[] memory = new int[n+1];
        return (int) store(n, memory);
    }

    public int store(int i,int[] memory){
        if(i <= 1) return i;
        if(memory[i] != 0) return memory[i];
        memory[i] = (store(i-1,memory) + store(i-2, memory)) % 1000000007;
        return memory[i];
    }
}



