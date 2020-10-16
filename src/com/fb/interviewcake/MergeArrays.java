package com.fb.interviewcake;

import com.fb.core.Test;

import java.util.Arrays;

public class MergeArrays implements Test{

    @Override
    public void test() {
        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

        System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
    }

    private static int[] mergeArrays(int[] myArray, int[] alicesArray) {
        int[] result  = new int[myArray.length + alicesArray.length];
        int ptr = 0;
        int i=0,j=0;
        for(; i< myArray.length && j < alicesArray.length; ){
            if(myArray[i]< alicesArray[j]){
                result[ptr++] = myArray[i++];
            }else{
                result[ptr++] = alicesArray[j++];
            }
        }

        while(i < myArray.length){
            result[ptr++] = myArray[i++];
        }

        while(j < alicesArray.length){
            result[ptr++] = alicesArray[j++];
        }

        return result;
    }


}
