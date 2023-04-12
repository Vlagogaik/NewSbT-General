package ru.myself;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

// Класс, реализующий запись и чтение файлов с использованием NIO
class NIOFileHandler implements FileHandler {
    @Override
    public void writeToFile(String fileName, String data) throws IOException {
        Files.write(Paths.get(fileName), data.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String readFromFile(String fileName) throws IOException {
        byte[] encodedBytes = Files.readAllBytes(Paths.get(fileName));
        return new String(encodedBytes, StandardCharsets.UTF_8);
    }
}