package ru.digitalhabbits.homework2.impl;

import ru.digitalhabbits.homework2.LetterCounter;

import java.util.HashMap;
import java.util.Map;

public class LetterCounterImpl implements LetterCounter {
    @Override
    public Map<Character, Long> count(String input) {

        Map<Character, Long> stringLettersCount = new HashMap<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringLettersCount.putIfAbsent(chars[i], 0L);
            stringLettersCount.computeIfPresent(chars[i], (k, v) -> v + 1);
        }
        return stringLettersCount;
    }
}
