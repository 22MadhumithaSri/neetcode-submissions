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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(temp1!=null || temp2!=null)
        {
                int t=0;
                if(temp1==null){
                  t=carry+temp2.val;
                }
                else if(temp2==null){
                    t=carry+temp1.val;
                }
                else{
                 t=carry+temp1.val+temp2.val;
                }
                if(t/10 >=1)
                {
                    carry=t/10;
                    ListNode addedNode=new ListNode(t%10);
                    temp.next=addedNode;
                    temp=temp.next;
                }
                if(t/10<1)
                {
                    carry=0;
                    ListNode addedNode=new ListNode(t);
                    temp.next=addedNode;
                    temp=temp.next;
                }
             if(temp1==null){
       
             temp2=temp2.next;                }
                else if(temp2==null){
       
             temp1=temp1.next;
                       }
                else{
       
             temp1=temp1.next;
             temp2=temp2.next;
                             }
        
                  
        }
        if (carry>0)
        {
            ListNode addedNode=new ListNode(carry);
                    temp.next=addedNode;
        }
        return dummy.next;
    }

}
