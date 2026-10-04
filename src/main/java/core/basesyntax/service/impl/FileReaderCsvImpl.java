package core.basesyntax.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import core.basesyntax.service.FileReader;

public class FileReaderCsvImpl implements FileReader {
    @Override
    public List<String> readFromFile(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException("Can't read data from file: " + path, e);
        }
    }
}
