package ru.myself;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

// Класс, реализующий запись и чтение файлов с использованием NIO
class NIOFileHandler implements FileHandler {
    @Override
    public void writeToFile(String fileName, String data) throws IOException {
        String dataWithNewLine = data.replace("\n", System.lineSeparator()); // Заменяем все символы перевода строки на системный символ перевода строки
        Files.write(Paths.get(fileName), dataWithNewLine.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String readFromFile(String fileName) throws IOException {
        byte[] encodedBytes = Files.readAllBytes(Paths.get(fileName));
        String data = new String(encodedBytes, StandardCharsets.UTF_8);
        return data.replace(System.lineSeparator(), "\n");
    }
}
