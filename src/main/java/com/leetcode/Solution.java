package com.leetcode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode myNode = new ListNode();
        ListNode finalNode = myNode;
        int rest = 0;
        boolean create = false;
        while(true) {
            myNode.val = (l1.val + l2.val + rest) % 10;
            rest = (l1.val + l2.val) / 10;
            l1.val = 0;
            if (l1.next != null) {
                l1 = l1.next;
                create = true;
            }
            l2.val = 0;
            if (l2.next != null) {
                l2 = l2.next;
                create = true;
            }
            if (create) {
                myNode.next = new ListNode();
                myNode = myNode.next;
            }
            if (l1.next == null && l2.next == null) break;


        }
        myNode.val = (l1.val + l2.val + rest) % 10;
        return finalNode;
    }
}
