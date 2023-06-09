package ru.myself;

public enum Colors {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");
    public final String code;

    Colors(String code) {
        this.code = code;
    }
//    public String getCode() {
//        return code;
//    }
    public static String getCode(Colors colors) {
        return colors.code;
    }
}
