class Solution58_1{
    public int lengthOfLastWord(String s) {
        String[] arr=s.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i].length()>0)
                return arr[i].length();
        }
        return 0;
    }
}

// class Main {
//     public static void main(String[] args) {
//         // Create a new Solution instance
//         Solution58_1 solution = new Solution58_1();
//         // Create a test case
//         String x = "   fly me   to   the moon  ";
//         int answer = solution.lengthOfLastWord(x);
//         // int[][] x = {{0,0},{1,0},{2,0}};
//         // int answer = solution.numberOfBoomerangs(x);
//         // Print the answer
//         //System.out.println(answer);
//         //System.out.println(answer);
//     }
// }