package ru.spsuace.course.lesson2.classwork.throwable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ThrowableExample {

    // ---------- throw exception ----------


//    public static void main(String[] args) throws IOException {
////        exampleNPE(null);
//        exampleIOE(null);
//    }

    public static void exampleNPE(String arg) {
        if (arg == null) {
            throw new NullPointerException();
        }
    }

    public static void exampleIOE(String arg) throws IOException {
        if (arg == null) {
            throw new IOException();
        }
    }

    // ---------- try-catch-finally ----------

//    public static void main(String[] args) {
//        doSomething(new String[] {"FirstArgument", null, "Argument"});
//        System.out.println("------");
//        doSomething(new String[] {"SecondArgument", "", "Argument"});
//        System.out.println("------");
//        doSomething(new String[] {"ThirdArgument", "Argument"});
//        System.out.println("------");
//        doSomething(new String[] {"ForthArgument", "FifthArgument"});
//    }


    public static void doSomething(String[] args) {
        try {
            for (String arg : args) {
                validate(arg);
                doSomething(arg);
            }
        } catch (ValidationException e) {
            System.out.println(e.getMessage() + ". Please try again");
            // throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println(e.getClass());
        } finally {
            showResult();
        }
    }

    private static void showResult() {
        System.out.println("show result");
    }

    public static void doSomething(String arg) {
        if (arg.equals("Argument")) {
            throw new IllegalArgumentException(arg);
        }
        System.out.println("do something with " + arg);
    }

    public static void validate(String arg) throws ValidationException {
        if (arg == null) {
            throw new ValidationException("arg is null");
        }
        if (arg.isEmpty()) {
            throw new ValidationException("arg is empty");
        }
    }


    // ---------- try-with-resources ----------

    public static void tryWithoutResources() throws IOException {
        InputStream is = new FileInputStream("a.txt");
        try {
            readFromInputStream(is);
        } finally {
            try {
                is.close(); // тоже может бросить ошибку, потеряем исходную
            } catch (IOException e) { // игнорируем
            }
        }
    }

    public static void tryWithResources() throws IOException {
        try (InputStream is = new FileInputStream("a.txt")) {
            readFromInputStream(is);
        }
    }

    private static void readFromInputStream(InputStream is) {

    }


}
