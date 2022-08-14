package ru.digitalhabbits.homework2.impl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

class LetterCountMergerImplTest {

    @Test
    void merge2maps() {

        var map1 = new HashMap<Character, Long>();
        var map2 = new HashMap<Character, Long>();

        map1.put('a', 3L);
        map1.put('b', 6L);
        map1.put('e', 2L);
        map1.put('f', 4L);

        map2.put('a', 2L);
        map2.put('c', 5L);
        map2.put('d', 6L);
        map2.put('e', 3L);
        map2.put('f', 1L);

        Map<Character, Long> resMap = new LetterCountMergerImpl().merge(map1, map2);

        assertThat(resMap).containsOnly(
                entry('a', 5L),
                entry('b', 6L),
                entry('c', 5L),
                entry('d', 6L),
                entry('e', 5L),
                entry('f', 5L)
        );
    }
}