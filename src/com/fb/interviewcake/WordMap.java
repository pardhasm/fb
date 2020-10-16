package com.fb.interviewcake;

import com.fb.core.Test;

import java.util.HashMap;
import java.util.Map;

public class WordMap implements Test {
    public static Map makeMap(String input) {
        Map<String, Integer> words = new HashMap<>();

        for (String w : input.split(" ")) {
            words.put(w.toLowerCase(), words.getOrDefault(w, 0) + 1);
        }
        return words;
    }

    @Override
    public void test() {
        String input = "After beating the eggs, Dana read the next step: Add milk and eggs, then add flour and sugar.";
        Map<String, Integer> result = makeMap(input);
        result.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
