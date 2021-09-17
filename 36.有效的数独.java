/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */
import java.util.HashSet;
// @lc code=start
class Solution2 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> column = new HashSet<Character>();
        HashSet<Character> row = new HashSet<Character>();
        HashSet<Character> block = new HashSet<Character>();
        for (int i = 0; i < board.length; i++) {
            column.clear();
            for(int j = 0;j < board.length;j++)
            if (board[i][j] == '.') {
                continue;
            }else if(column.add((Character)board[i][j])){
                continue;
            }else{
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            row.clear();
            for(int i = 0;i < board.length;i++)
            if (board[j][i] == '.') {
                continue;
            }else if(row.add((Character)board[j][i])){
                continue;
            }else{
                return false;
            }
        }
        for(int i = 0; i < board.length; i += 3){
            for(int j = 0; j < board.length; j += 3){
                block.clear();
                for(int x = i; x < i + 3; x ++){
                    for(int y = j; y < j + 3; y ++){
                        if (board[x][y] == '.') {
                            continue;
                        }else if(block.add((Character)board[x][y])){
                            continue;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(s.contains(Character.toString(board[i][j]))) return false;
                s.add(Character.toString(board[i][j]));
                // System.out.println(s);
            }
            s.clear();
            for(int j = 0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(s.contains(Character.toString(board[j][i]))) return false;
                s.add(Character.toString(board[j][i]));
                // System.out.println(s);
            }
            s.clear();
        }
        for(int i = 0;i<=6;i=i+3){
            for(int ii = 0;ii<=6;ii=ii+3){
                for(int j = 0;j<3;j++){
                    for(int k = 0;k<3;k++){
                        if(board[j+i][k+ii]=='.') continue;
                        if(s.contains(Character.toString(board[j+i][k+ii]))) return false;
                        s.add(Character.toString(board[j+i][k+ii]));
                        // System.out.println(s);
                    }
                }
                s.clear();
            }
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        Solution2 solution = new Solution2();
        // Create a test case
        char[][] x = {{'.','.','4','.','.','.','6','3','.'},{'.','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','9','.'},{'.','.','.','5','6','.','.','.','.'},{'4','.','3','.','.','.','.','.','1'},{'.','.','.','7','.','.','.','.','.'},{'.','.','.','5','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}};
        boolean answer = solution.isValidSudoku(x);
        // int[][] x = {{0,0},{1,0},{2,0}};
        // int answer = solution.numberOfBoomerangs(x);
        // Print the answer
        //System.out.println(answer);
        System.out.println(answer);
    }
}
// @lc code=end

