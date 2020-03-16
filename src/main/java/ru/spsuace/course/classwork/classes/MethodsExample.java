package ru.spsuace.course.classwork.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class MethodsExample {

    //  ---------- initialization ----------

//    public static void main(String[] args) {
//        new MethodsExample("Example");
//        System.out.println("---------");
//        new MethodsExample();
//    }


    {
//        System.out.println(name);
        System.out.println("init 1");
    }
    private String name = "Irina";

    {
        System.out.println("init 2: " + name);
    }

    public MethodsExample(String name) {
        this.name = name;
        System.out.println("init 3: " + this.name);
    }

    public MethodsExample() {
        this("default");
        System.out.println("init 4: " + this.name);
    }

    //  ---------- method ----------
    public static final void bigMethod(String name, MethodsExample example) throws IOException {
        //doNothing
        print((short)1);
//        print((short)1, 2);
        print(1d);
    }

    //  ---------- Overloading and casting ----------

    public static void main(String[] args) {
        print(123L);
        print(123);
        print((byte) 123);
        print(123F);
        print(123, 123L);
    }

    public static void print(short a) {
        System.out.println("short arg: " + a);
    }

    public static void print(long a, int b) {
        System.out.println("int arg: " + a + b);
    }
    public static void print(int a, double b) {
        System.out.println("int arg: " + a + b);
    }

    public static void print(long a) {
        System.out.println("long arg: " + a);
    }

    public static void print(double a) {
        System.out.println("double arg: " + a);
    }

    //  ---------- static ----------

    public static final double PI = 3.14159265358979323846;

//    public static void main(String[] args) {
//        System.out.println("Pi = " + PI);
//        System.out.println("Pi = " + MethodsExample.PI);
//        System.out.println("Pi = " + new MethodsExample().PI);
//    }

    //  ---------- final ----------

    private final int id = 0;

    public final void changeId(final int id) {
//        this.id = id;
        final int temp = id;
//        id = 2;
//        temp = 3;
        List<String> list = new ArrayList<>();
        for (String s : list) {

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
