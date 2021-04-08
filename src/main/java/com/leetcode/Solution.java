package com.leetcode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode myNode = new ListNode();
        ListNode finalNode = myNode;
        int rest = 0;

        while(true) {
            myNode.val = (l1.val + l2.val + rest) % 10;
            rest = (l1.val + l2.val + rest) / 10;
            l1.val = 0;
            if (l1.next != null) {
                l1 = l1.next;
            }
            l2.val = 0;
            if (l2.next != null) {
                l2 = l2.next;
            }
            if (l1.val == 0 && l2.val == 0 && l1.next == null && l2.next == null &&  rest == 0) break;

            myNode.next = new ListNode();
            myNode = myNode.next;

        }

        return finalNode;
    }
}
