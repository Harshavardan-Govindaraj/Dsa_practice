
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        while (temp1 != null) {
            ListNode temp2 = headB;// each time we should strat checking from start of list 2
            while (temp2 != null) {
                if (temp1 == temp2)
                    return temp1;
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }
}