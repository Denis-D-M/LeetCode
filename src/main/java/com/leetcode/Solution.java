package com.leetcode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int target = getNum(l1) + getNum(l2);
        StringBuilder builder = new StringBuilder();
        builder.append(target);
        char[] chars = new char[builder.length()];
        builder.getChars(0, builder.length(), chars, 0);

        ListNode parentNode = new ListNode();

        for (int i = 0; i < chars.length; i++){
            parentNode.next = new ListNode();
            parentNode.val = Integer.parseInt(String.valueOf(chars[i]));
            parentNode = parentNode.next;
        }
        return parentNode;
    }

    public int getNum(ListNode node){
        ListNode myNode = node;
        StringBuilder builder = new StringBuilder();
        while (true){
            builder.append(myNode.val);
            if (myNode.next == null) break;
            myNode =  myNode.next;
        }
        builder.reverse();
        return Integer.parseInt(builder.toString());
    }
}