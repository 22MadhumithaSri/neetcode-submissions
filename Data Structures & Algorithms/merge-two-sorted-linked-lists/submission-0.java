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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged=new ListNode(0);
        ListNode cur=merged;
if(list1==null)
 return list2;
 if(list2==null)
 return list1;
        ListNode temp1=list1;
        ListNode temp2=list2;
        
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
             { cur.next=temp1;
             temp1=temp1.next;;
             }
else
            {
              cur.next=temp2;
             temp2=temp2.next;
             
            }
         cur=cur.next;
        }
        if(temp1!=null)
          cur.next=temp1;
        else
          cur.next=temp2;
        return merged.next;
    }
}