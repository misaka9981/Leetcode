
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int length = 0;
        ListNode tmp1 = head;    
        while(tmp1!=null){
            length++;
            tmp1 = tmp1.next;
        }
        ListNode tmp2 = head;
        for (int i = 0; i < length-k; i++) {
            tmp2 = tmp2.next;
        }
        return tmp2;
    }

}