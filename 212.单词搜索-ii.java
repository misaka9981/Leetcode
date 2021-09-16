/*
 * @lc app=leetcode.cn id=212 lang=java
 *
 * [212] 单词搜索 II
 */

// @lc code=start
class Solution {
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};
    public static List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        if(board == null || board.length == 0 || board[0].length == 0 || words == null || words.length == 0){
            return res;
        }
        for(String word : words){
            for(int i = 0;i < board.length ; i ++){
                for(int j = 0;j < board[0].length ; j ++){
                    if(word.charAt(0) == board[i][j]){
                        dfs(board , i , j , 0 , word , res);

                    }
                }
            }
        }
        return res;
    }
    public static void dfs(char[][] board , int x , int y , int index , String word , List<String> res){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || index >= word.length() || board[x][y] != word.charAt(index)){
            return ;
        }
        if(index == word.length() - 1 && !res.contains(word)){
            res.add(word);
        }
        char c = board[x][y];
        board[x][y] = '#';
        for(int i = 0;i < dx.length; i ++){
            dfs(board , x + dx[i] , y + dy[i] , index + 1 , word , res);
        }
        board[x][y] = c;
    }


    
}


// @lc code=end

