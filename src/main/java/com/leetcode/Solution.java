package com.leetcode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int target = getNum(l1) + getNum(l2);
        ListNode myNode = new ListNode();
        ListNode finalNode = myNode;
        while(true){
            myNode.val = target % 10;
            target /= 10;
            if (target == 0) break;
            myNode.next = new ListNode();
            myNode = myNode.next;
        }
        return finalNode;
    }

    public int getNum(ListNode node){
        StringBuilder builder = new StringBuilder();
        while (true){
            builder.append(node.val);
            if (node.next == null) break;
            node =  node.next;
        }
        builder.reverse();
        return Integer.parseInt(builder.toString());
    }
}
