package ru.digitalhabbits.homework2.impl;

import ru.digitalhabbits.homework2.FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReaderImpl implements FileReader {
    @Override
    public Stream<String> readLines(File file) {

        try (Stream<String> fileLineStream = Files.lines(Path.of(file.getPath()))) {
            return Files.lines(Path.of(file.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
            return Stream.of("");
        }
    }
}
