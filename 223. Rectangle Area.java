
class Solution223_1 {
    public int computeArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        int s1 = (x2 - x1) * (y2 - y1);
        int s2 = (x4 - x3) * (y4 - y3);
        if (x2 <= x3 || y3 >= y2 || y1 >= y4 || x1 >= x4){
            return s1 + s2;
        }
        int topX = Math.min(x4,x2);
        int topY = Math.min(y4,y2);
        int bottomX = Math.max(x1,x3);
        int bottomY = Math.max(y1,y3);
        return s1 - (topX - bottomX) * (topY - bottomY) + s2;
    }
}