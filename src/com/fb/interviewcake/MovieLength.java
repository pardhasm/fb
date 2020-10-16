package com.fb.interviewcake;

import com.fb.core.Test;

import java.util.HashMap;

public class MovieLength implements Test {
    private static Boolean match(int flightLength, int[] movieLengths) {
        HashMap<Integer, Integer> movies = new HashMap<>();
        for (int m : movieLengths) {
            if (movies.containsKey(flightLength - m)) {
                return true;
            }
            movies.put(m, m);
        }
        return false;
    }

    @Override
    public void test() {
        int[] movieLengths = new int[]{4, 7, 3, 5, 8, 1, 6, 9};
        int flightLength = 19;
        Boolean moviesPossible = match(flightLength, movieLengths);
        System.out.println(moviesPossible);
    }
}
