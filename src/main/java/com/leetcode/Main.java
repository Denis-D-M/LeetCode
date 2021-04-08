package com.leetcode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node = solution.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(5, new ListNode(6, new ListNode(4))));
//        ListNode node = solution.addTwoNumbers(new ListNode(0), new ListNode(0));
        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);

    }
}
