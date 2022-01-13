package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    @Test
    void testOne() {
        FileReader fr = new FileReader();
        System.out.println(fr.readInFromFile(Path.of("src/main/resources/beosztas.txt")));
    }
}