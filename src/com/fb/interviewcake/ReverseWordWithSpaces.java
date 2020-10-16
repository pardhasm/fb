package com.fb.interviewcake;

import com.fb.core.Test;

public class ReverseWordWithSpaces implements Test {
    @Override
    public void test() {
        char[] message = { 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' };

        message = reverse(message, 0, message.length-1);

        int start  = 0;
        for(int i = 0; i < message.length; i++){
            if(message[i] == ' ' ){
                message  = reverse(message, start, i-1);
                start = i+1;
            }

            if( i == message.length -1){
                message  = reverse(message, start, i);
                start = i+1;
            }
        }
        System.out.println(message);
    }

    public static char[] reverse(char[] input, int start, int end){
        while(start <end){
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++; end--;
        }
        return input;
    }
}
