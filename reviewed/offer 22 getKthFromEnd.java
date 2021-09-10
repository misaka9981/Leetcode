
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


class Solution2 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && k > 0){
            fast = fast.next;
            k--;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a new Solution instance
        Solution2 solution = new Solution2();
        // Create a test case
       
        ListNode answer = solution.getKthFromEnd(head1,3);
        // Print the answer
        System.out.println(answer);
    }
}