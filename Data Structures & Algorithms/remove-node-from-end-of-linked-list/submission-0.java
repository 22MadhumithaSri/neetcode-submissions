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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode fast = dummy, slow = dummy;

for(int i = 0; i < n; i++)
    fast = fast.next;

while(fast.next != null) {
    fast = fast.next;
    slow = slow.next;
}
slow.next = slow.next.next;
return dummy.next;
    //     int k=0;
    //     ListNode fast=head;
    //     ListNode slow=head;
    //     ListNode prev=head;

    //    while(k<n)
    //    {
    //      fast=fast.next;
    //      k++;
    //    }
    //    if(fast == null) return head.next;  // removing head
    //    while(fast.next!=null)
    //    {
    //      fast=fast.next;
    //      prev=slow;
    //      slow=slow.next;

    //    }
    //    prev.next=slow.next.next;
    //    return head;
    // }
}
}
