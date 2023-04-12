package ru.myself;

import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные для сохранения в файл с использованием I/O: ");
        String dataIO = scanner.nextLine();
        System.out.print("Введите имя файла для сохранения данных с использованием I/O: ");
        String fileNameIO = scanner.nextLine();
        System.out.print("Введите данные для сохранения в файл с использованием NIO: ");
        String dataNIO = scanner.nextLine();
        System.out.print("Введите имя файла для сохранения данных с использованием NIO: ");
        String fileNameNIO = scanner.nextLine();

        IOFileHandler ioFileHandler = new IOFileHandler();
        NIOFileHandler nioFileHandler = new NIOFileHandler();

        try {
            ioFileHandler.writeToFile(fileNameIO, dataIO);
            nioFileHandler.writeToFile(fileNameNIO, dataNIO);

            System.out.println("\nДанные сохранены в файлы.");

            String readDataIO = ioFileHandler.readFromFile(fileNameIO);
            String readDataNIO = nioFileHandler.readFromFile(fileNameNIO);

            System.out.println("\nДанные, прочитанные из файла с использованием I/O:");
            System.out.println(readDataIO);

            System.out.println("\nДанные, прочитанные из файла с использованием NIO:");
            System.out.println(readDataNIO);
        } catch (IOException e) {
            System.err.println("Произошла ошибка ввода/вывода: " + e.getMessage());
        }
        scanner.close();
    }
}
