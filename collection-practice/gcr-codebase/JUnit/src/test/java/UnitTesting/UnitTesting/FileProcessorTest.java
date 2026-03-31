package UnitTesting.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    FileProcessor processor;
    String filename = "testfile.txt";

    @BeforeEach
    void setUp() {
        processor = new FileProcessor();
    }

    @AfterEach
    void tearDown() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete(); // clean up after test
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit File Test";

        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        processor.writeToFile(filename, "Test Content");

        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testReadFileThatDoesNotExist() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}
