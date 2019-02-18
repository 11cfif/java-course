package ru.spsuace.course.lesson2.classwork.classes;

import java.util.AbstractList;
import java.util.List;

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
            return (T)arr[index];
        }
    }

    public static void main(String[] args) {
        OldList old = new OldList();
        old.add(1);
        old.add("two");
        Integer int00 = (Integer) old.get(0);
        Integer int01 = (Integer) old.get(1); // runtime error!


        NewList<Integer> newList = new NewList<>();
        newList.add(1);
//        newList.add("two");
        Integer int10 = newList.get(0);
        Integer int11 = newList.get(1); // runtime error!
    }

    private static OldList integerListOld() {
        return new OldList();
    }

}
