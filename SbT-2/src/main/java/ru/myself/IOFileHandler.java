package ru.myself;

import java.io.*;
// Класс, реализующий запись и чтение файлов с использованием IO
class IOFileHandler implements FileHandler {
    @Override
    public void writeToFile(String fileName, String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            writer.newLine();
        }
    }

    @Override
    public String readFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            return sb.toString();
        }
    }
}




