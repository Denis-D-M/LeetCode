package com.leetcode;

import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("123dadas"));
    }

    public static int romanToInt(String s) {
        Stream.of(s).
                map(str -> str.replaceAll("[IV]", "4"))
                .map(str -> str.replaceAll("[IX]]", "9"))
                .map(str -> str.replaceAll("[XL]]", "40"))
                .map(str -> str.replaceAll("[XC]]", "90"))
                .map(str -> str.replaceAll("[CD]]", "90"))
                .map(str -> str.replaceAll("[CM]]", "90"))
                .toString();
    }
}
