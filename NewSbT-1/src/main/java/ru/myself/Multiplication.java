package ru.myself;

class Multiplication {
    public static int multiply(int a, int b) throws OlegException {
        if (a % 2 != 0 || b % 2 != 0) {
            throw new OlegException("Error: Only even numbers allowed");
        }
        return a * b;
    }
}

