package ru.myself;

import java.io.IOException;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileHandlerTest {
    private static final String TEST_FILE_NAME = "Oleg.txt";
    private static final String TEST_FILE_NAME_1 = "OlegPo.txt";
    private static final String TEST_DATA = "serjfiseoyhfiugsbihfgseiuy";

    private FileHandler ioFileHandler = new IOFileHandler();
    private FileHandler nioFileHandler =  new NIOFileHandler();

    @Test
    public void testWriteAndReadWithIO() throws IOException {
        ioFileHandler.writeToFile(TEST_FILE_NAME, TEST_DATA);
        String readData = ioFileHandler.readFromFile(TEST_FILE_NAME);
        assertEquals("Чтение данных из файла должно совпадать с записанными данными", TEST_DATA, readData);
    }

    @Test
    public void testWriteAndReadWithNIO() throws IOException {
        nioFileHandler.writeToFile(TEST_FILE_NAME, TEST_DATA);
        String readData = nioFileHandler.readFromFile(TEST_FILE_NAME);
        assertEquals("Чтение данных из файла должно совпадать с записанными данными", TEST_DATA, readData);
    }

    @Test(expected = IOException.class)
    public void testReadNonExistingFileWithIO() throws IOException {
        ioFileHandler.readFromFile(TEST_FILE_NAME_1);
    }

    @Test(expected = IOException.class)
    public void testReadNonExistingFileWithNIO() throws IOException {
        nioFileHandler.readFromFile(TEST_FILE_NAME_1);
    }
}
