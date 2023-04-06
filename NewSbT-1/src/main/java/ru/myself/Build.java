package ru.myself;
import java.util.Scanner;
public class Build {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            int result = Multiplication.multiply(a, b);
            System.out.println("Result:  " + result);
        } catch (OlegException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
