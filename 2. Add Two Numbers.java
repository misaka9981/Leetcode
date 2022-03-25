/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
 }
class Solution2_1 {
    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        //指向两条链表的指针
        ListNode2 p1 = l1, p2 = l2;
        //虚拟头节点
        ListNode2 v1 = new ListNode2(-1);
        //构建新链表
        ListNode2 p = v1;
        //记录进位
        int carry = 0;
        while (p1 != null || p2 != null || carry > 0) {
            int val = carry;
            if (p1 != null) {
                val += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                val += p2.val;
                p2 = p2.next;
            }
            carry = val / 10;
            val = val % 10;
            p.next = new ListNode2(val);
            p = p.next;
        }
        return v1.next;
    }
}