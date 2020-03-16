package ru.spsuace.course.classwork.concurrency;

@SuppressWarnings("WeakerAccess")
public class SynchronizedExamples {

    private final Object obj;
    private final String name;

    public SynchronizedExamples(Object obj, String name) {
        this.obj = obj;
        this.name = name;
    }

    public synchronized void doSomething() {

    }

    public void doSomething1() {
        synchronized (obj) {
            doOther();
        }
    }

    public boolean work = false;

    private void doOther() {
        double sum = 0;
        for (int i = 0; i < 100_000_000; i++) {
            work = true;
            sum += Math.sin(i);
            if (i % 1_000_000 == 0) {
                System.out.println("name =" + name + ", sum = " + sum);
            }
            if (i == 5_000_000) {
                try {
                    while (work) {
                        work = false;
                        obj.wait(1000);
                    }
                    work = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        obj.notify();
    }

    public static void main(String[] args) {

        Object obj = new Object();
        new Thread(() ->
                new SynchronizedExamples(obj, "first").doSomething1()).start();

        new Thread(() ->
                new SynchronizedExamples(obj, "second").doSomething1()).start();

        System.out.println("end");
    }
}
