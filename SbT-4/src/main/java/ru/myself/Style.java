package ru.myself;

public enum Style {
    DEFAULT(""),
    ARROW(""),
    STAR(" * "),
    RESET("\u001B[0m");
    public final String value;

    Style(String value) {
        this.value = value;
    }

//    public static String getValue(Style style) {
//        return style.value;
//    }
public static String getValue(Style style, String value) {
    if (style == Style.ARROW) {
        return " -> " + value + " <- ";
    } else {
        return style.value + value + style.value;
    }
}


}
