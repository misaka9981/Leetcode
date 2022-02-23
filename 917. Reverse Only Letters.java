class Solution917_1 {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int lIndex = 0, rIndex = s.length() - 1;
        while (lIndex < rIndex) {
            if (!Character.isLetter(chars[lIndex])) {
                lIndex++;
            }
            if (!Character.isLetter(chars[rIndex])) {
                rIndex--;
            }
            if (Character.isLetter(chars[lIndex]) && Character.isLetter(chars[rIndex])) {
                char tmp = chars[lIndex];
                chars[lIndex] = chars[rIndex];
                chars[rIndex] = tmp;
                lIndex++;
                rIndex--;
            }
        }
        return new String(chars);
    }
}