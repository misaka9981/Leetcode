package reviewed;/*
 * @lc app=leetcode.cn id=68 lang=java
 *
 * [68] 文本左右对齐
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// @lc code=start
class Solution68_1 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int len = words.length, index = 0;
        char[] chars = new char[maxWidth];
        while (index < len) {
            //这一个单词就占据整行
            if (words[index].length() == maxWidth) {
                res.add(words[index++]);
            } else {
                //获取当前行可以放置的最多的字符串
                int count = 0;
                List<String> temp = new ArrayList<>();
                while (index < len && (count + words[index].length() + temp.size()) <= maxWidth) {
                    temp.add(words[index]);
                    count += words[index++].length();
                }
                //整行只能放一个单词那么进行左对齐即可
                if (temp.size() == 1) {
                    String s = temp.get(0);
                    Arrays.fill(chars, ' ');
                    for (int i = 0; i < s.length(); i++) {
                        chars[i] = s.charAt(i);
                    }
                    res.add(String.valueOf(chars));
                } else if (index == len) {//最后一行
                    Arrays.fill(chars, ' ');
                    int t = 0;
                    for (String s : temp) {
                        for (char c : s.toCharArray()) {
                            chars[t++] = c;
                        }
                        t++;
                    }
                    res.add(String.valueOf(chars));
                } else {
                    //平均分配这些字符串
                    int spaceSize = temp.size() - 1;
                    int totalLength = 0;
                    for (String s : temp) totalLength += s.length();
                    totalLength = maxWidth - totalLength;
                    Arrays.fill(chars, ' ');
                    int t = 0;
                    for (String s : temp) {
                        for (char c : s.toCharArray()) {
                            chars[t++] = c;
                        }
                        if (spaceSize == 0) continue;
                        int spaceNum = totalLength % spaceSize == 0 ? totalLength / spaceSize : totalLength / spaceSize + 1;
                        t += spaceNum;
                        totalLength -= spaceNum;
                        spaceSize--;
                    }
                    res.add(String.valueOf(chars));
                }
            }
        }
        return res;
    }
}
// @lc code=end

