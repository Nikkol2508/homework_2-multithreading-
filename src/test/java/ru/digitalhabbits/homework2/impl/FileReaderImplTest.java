package ru.digitalhabbits.homework2.impl;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.stream.Stream;

import static com.google.common.io.Resources.getResource;
import static org.junit.jupiter.api.Assertions.*;

class FileReaderImplTest {

    @Test
    void read_file_to_stream_string() {

        var file = getFile("test.txt");
        Stream<String> stringStream = new FileReaderImpl().readLines(file);

        assertEquals(1000L, stringStream.count());

    }

    private File getFile(String name) {
        return new File(getResource(name).getPath());
    }
}