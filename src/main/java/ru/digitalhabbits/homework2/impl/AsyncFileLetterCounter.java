package ru.digitalhabbits.homework2.impl;

import java.io.File;
import java.util.Collections;
import java.util.Map;

import ru.digitalhabbits.homework2.FileLetterCounter;

public class AsyncFileLetterCounter implements FileLetterCounter {

    private final FileReaderImpl fileReader = new FileReaderImpl();
    private final LetterCounterImpl letterCounter = new LetterCounterImpl();
    private final LetterCountMergerImpl letterCountMerger = new LetterCountMergerImpl();

    @Override
    public Map<Character, Long> count(File input) {

        return fileReader.readLines(input)
                .parallel()
                .map(letterCounter::count)
                .reduce(letterCountMerger::merge)
                .orElse(Collections.emptyMap());
    }
}
