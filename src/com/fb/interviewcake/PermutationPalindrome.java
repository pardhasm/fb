package com.fb.interviewcake;

import com.fb.core.Test;

import java.util.HashMap;

public class PermutationPalindrome implements Test {
    public static Boolean checkPalindrome(String input) {
        HashMap<Character, Character> chars = new HashMap<>();
        for (char s : input.toCharArray()) {
            if (chars.containsKey(s)) {
                chars.remove(s);
            } else {
                chars.put(s, s);
            }
        }
        return chars.keySet().size() <= 1;
    }

    @Override
    public void test() {
        String input = "civil";//"civci";
        System.out.println(checkPalindrome(input));
    }
}
