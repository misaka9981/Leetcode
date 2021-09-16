//using BF
class Solution1 {
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
//store the value
class test {
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


//class Main {
//    public static void main(String[] args) {
//        // Create a new Solution instance
//        test t = new test();
//        // Create a test case
//        int x = 4;
//        int answer = t.fib(x);
//        // Print the answer
//        System.out.println(answer);
//    }
//}
