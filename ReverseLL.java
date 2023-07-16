//https://leetcode.com/problems/reverse-linked-list/description/

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode after=pres.next;
        while (pres!=null){
            pres.next=prev;
            prev=pres;
            pres=after;
            if (after!=null){
                after=after.next;
            }


        }

        return prev;
        
    }
}
