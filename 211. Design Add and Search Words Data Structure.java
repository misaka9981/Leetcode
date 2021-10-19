import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class WordDictionary {
    //令字符串长度作为关键字
    Map<Integer, Set<String>> map = new HashMap<>();
    public WordDictionary() {

    }

    public void addWord(String word) {
        int len = word.length();
        if(map.get(len)!=null){
            map.get(len).add(word);
        }else{
            Set<String> set = new HashSet<>();
            set.add(word);
            map.put(len,set);
        }
    }

    public boolean search(String word) {
        Set<String> set = map.get(word.length());
        if (set==null) return false;
        if (set.contains(word)) return true;
        char[] chars = word.toCharArray();
        P:for(String s : set){
            if(word.length()!=s.length()){
                continue;
            }
            char[] cs = s.toCharArray();
            for(int i = 0; i< cs.length; i++){
                if(chars[i] != '.' && chars[i] != cs[i]){
                    continue P;
                }
            }
            set.add(word);
            return true;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */