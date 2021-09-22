
class ListNode725 {
    int val;
    ListNode725 next;
    ListNode725() {}
    ListNode725(int val) { this.val = val; }
    ListNode725(int val, ListNode725 next) { this.val = val; this.next = next; }
}

class Solution725_1 {
    public ListNode725[] splitListToParts(ListNode725 head, int k) {
        int len = 0;
        ListNode725 p = head;
        while(p != null) {
            len++;
            p = p.next;
        }
        p = head;
        int a = len / k,b = len % k;
        ListNode725[] ans = new ListNode725[k];
        for(int i = 0; i < k; ++i) {
            ans[i] = p;
            if(p == null) continue;
            ListNode725 temp = p;
            for(int j = 0; j < a + (b > 0? 1 : 0) - 1; ++j) {
                temp = temp.next;
            }
            p = temp.next;
            temp.next = null;
            b--;
        }
        return ans;
    }
}
