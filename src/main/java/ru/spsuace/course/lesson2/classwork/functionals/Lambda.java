package ru.spsuace.course.lesson2.classwork.functionals;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Lambda {

    public static File[] getJavaFiles(File directory) {
        File[] files =  directory.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        });

        files = directory.listFiles(file -> file.getName().endsWith(".java"));
        return files;
    }

    private int counter;

    public void lambda() {
        IntUnaryOperator operator = x -> { return (x % 2 == 0) ? x : x - 1; };
        IntUnaryOperator simpleOperator = x -> (x % 2 == 0) ? x : x - 1;

        int bonus = 10;
        IntUnaryOperator hardOperator = x -> {
            counter++;
            return x + bonus;
        };
//        bonus = 12;
    }

    public void link() {
        IntBinaryOperator intComparator = Integer::compare;
        Consumer<Object> printer = System.out::println;
        Function<Object, String> toString = Object::toString;
        IntFunction<Object[]> arrayCreator = Object[]::new;

    }
}
