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
    public void reorderList(ListNode head) {
        ListNode fast=head,slow=head;
        ListNode l1=head;
        ListNode l1Move=slow;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            l1Move=slow;
            fast=fast.next.next;
        }
        ListNode cur=slow.next;

        l1Move.next=null;
        ListNode prev=null;
        ListNode next;

        while(cur!=null)
        {
          next=cur.next;
          cur.next=prev;
          prev=cur;
          cur=next;
        }

            // ListNode result1=new ListNode(0);
            // ListNode result=result1;
        ListNode temp1=l1.next;
        ListNode temp2=prev;
        ListNode now=head;
        while(temp1!=null && temp2!=null)
{
    System.out.println(now.val);
    now.next=temp2;
        temp2=temp2.next;
    now=now.next;
        System.out.println(now.val);
    now.next=temp1;
        now=now.next;
    temp1=temp1.next;
}
if(temp2==null)
  now.next=temp1;
else
 now.next=temp2;
         System.out.println(now.val);

    }
}
