//https://leetcode.com/problems/add-two-numbers/submissions/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode temp = node;
        int carry = 0;

        while(l1!=null || l2!=null){
            int l1_val = (l1!=null) ? l1.val: 0;
            int l2_val = (l2!=null) ? l2.val: 0;

            int sum = l1_val+l2_val+carry;
            carry = sum/10;
            ListNode new_node = new ListNode(sum%10);
            temp.next = new_node;

            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if(carry > 0){
            ListNode new_node = new ListNode(carry);
            temp.next = new_node;
            temp = temp.next;
        }

        return node.next;
    }
}
