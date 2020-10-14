package com.fb.arrays;

import com.fb.core.Test;

public class ReverseStringInPlace implements Test {
    @Override
    public void test() {
        String input = "123456";
        String result = new String(reverseInPlace(input.toCharArray()));
        System.out.println(result);
    }

    public static  char[] reverseInPlace(char[] input){
        for(int i=0, j= input.length -1; i <=j; i++, j--){
            char temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
        return input;
    }
}
