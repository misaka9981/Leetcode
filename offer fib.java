class Solution {
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

class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        Solution solution = new Solution();
        // Create a test case
        int answer = solution.fib(5);
        // Print the answer
        System.out.println(answer);
    }
}