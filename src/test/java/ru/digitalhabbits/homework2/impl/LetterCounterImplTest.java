package ru.digitalhabbits.homework2.impl;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

class LetterCounterImplTest {

    @Test
    void string_to_map_char_count() {

        var input = "fffcaacffffdedcf";
        var mapper = new LetterCounterImpl();

        Map<Character, Long> count = mapper.count(input);

        assertThat(count).containsOnly(
                entry('a', 2L),
                entry('c', 3L),
                entry('d', 2L),
                entry('e', 1L),
                entry('f', 8L)
        );

    }
}