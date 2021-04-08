package com.leetcode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(9);
        ListNode listNode1 = new ListNode(9);
        ListNode listNode2 = new ListNode(9);
        ListNode listNode3 = new ListNode(9);
        ListNode listNode4 = new ListNode(9);
        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(9);
        ListNode listNode7 = new ListNode(9);
        ListNode listNode8 = new ListNode(9);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        ListNode node0 = new ListNode(9);
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode node = solution.addTwoNumbers(listNode, node0);
        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);

    }
}
