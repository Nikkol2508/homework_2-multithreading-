package ru.digitalhabbits.homework2.impl;

import ru.digitalhabbits.homework2.LetterCountMerger;

import java.util.HashMap;
import java.util.Map;

public class LetterCountMergerImpl implements LetterCountMerger {
    @Override
    public Map<Character, Long> merge(Map<Character, Long> first, Map<Character, Long> second) {
        Map<Character, Long> res = new HashMap<>(first);
        second.forEach((k, v) -> res.merge(k, v, (v1, v2) -> v1 + v2));
        return res;
    }
}
