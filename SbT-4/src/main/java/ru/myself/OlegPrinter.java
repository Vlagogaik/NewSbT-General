package ru.myself;
import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


import static ru.myself.Style.*;
import static ru.myself.Colors.*;
@Paint(style = DEFAULT, color = Colors.WHITE)
public class OlegPrinter {

        @Paint(style = ARROW, color = Colors.GREEN)
        public String getOleg1() {
            return "This is Oleg 1";
        }

        @Paint(style = STAR, color = Colors.YELLOW)
        public String getOleg2() {
            return "This is Oleg 2";
        }
        @Paint(style = DEFAULT, color = CYAN)
        public String getOleg3() {
            return "This is Oleg 3";
        }

        @Paint(style = DEFAULT, color = Colors.BLUE)
        public String getOleg4() {
            return "This is Oleg 4";
        }

    public static void print(Object obj) throws Exception {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            Paint methodAnnotation = method.getAnnotation(Paint.class);
            if (methodAnnotation != null) {
                System.out.println(getCode(methodAnnotation.color()) + getValue(methodAnnotation.style(), method.invoke(obj).toString()));
            }
        }
    }


    }

