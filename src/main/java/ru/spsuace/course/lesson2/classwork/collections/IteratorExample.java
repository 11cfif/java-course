package ru.spsuace.course.lesson2.classwork.collections;

import java.util.Iterator;

public class IteratorExample {

    static void forEach(Iterable<String> iterable) {
        for (String str : iterable) {
            System.out.println(str);
        }
    }

    static void iterLoop(Iterable<String> iterable) {
        for (Iterator<String> it = iterable.iterator(); it.hasNext(); ) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
