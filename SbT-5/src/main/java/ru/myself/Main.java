package ru.myself;

public class Main {
    public static void main(String[] args) {
        NumberChecker numberChecker = number -> number % 13 == 0;

        StringComparator stringComparator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        };

        DiscriminantCalculator discriminantCalculator = (a, b, c) -> b * b - 4 * a * c;

        System.out.println(numberChecker.check(27));
        System.out.println(numberChecker.check(39));

        System.out.println(stringComparator.compare("Hellos", "World"));
        System.out.println(stringComparator.compare("Java", "Programming"));

        System.out.println(discriminantCalculator.calculate(1, -3, 2));
        System.out.println(discriminantCalculator.calculate(2, 5, 2));
    }
}
