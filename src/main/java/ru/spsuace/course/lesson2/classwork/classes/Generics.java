package ru.spsuace.course.lesson2.classwork.classes;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Generics {

    private static class OldList {
        Object[] arr = new Object[1000];
        int i = 0;

        public boolean add(Object e) {
            arr[i++] = e;
            return true;
        }

        public Object get(int index) {
            return arr[index];
        }
    }

    private static class NewList<T> {
        Object[] arr = new Object[1000];
        int i = 0;

        public boolean add(T e) {
            arr[i++] = e;
            return true;
        }

        public T get(int index) {
            return (T) arr[index];
        }
    }

//    public static void main(String[] args) {
//        OldList old = new OldList();
//        old.add(1);
//        old.add("two");
//        Integer int00 = (Integer) old.get(0);
//        Integer int01 = (Integer) old.get(1); // runtime error!
//
//
//        NewList<Integer> newList = new NewList<>();
//        newList.add(1);
////        newList.add("two");
//        Integer int10 = newList.get(0);
//        Integer int11 = newList.get(1); // runtime error!
//    }

    private static OldList integerListOld() {
        return new OldList();
    }


    public static void main(String[] args) {
        Optional<String> stringOptional;
        Optional<Integer> integerOptional;
        Optional<int[]> inrArrayOptional;
//        Optional<int> intOptional;

        List list = new ArrayList();

    }

    private static <T> void restrictions() {
        Optional<String> stringOptional;
        Optional<Integer> integerOptional;
        Optional<int[]> inrArrayOptional;
//        Optional<int> intOptional;


//        T obj = new T();
//        T obj1 = new Object();
        List<String> strings = new ArrayList<>();
        List<Object> objects = new ArrayList<>();
//        objects = strings;
    }


    private static <T> void last() {
        List oldList = new ArrayList();
        List<String> strings = new ArrayList<>();
        List<? extends Number> numbersAndChildreen = new ArrayList<>();
        List<? super Integer> integersAndParents = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        numbersAndChildreen = integers;
    }


}
