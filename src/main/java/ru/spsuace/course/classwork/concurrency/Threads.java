package ru.spsuace.course.classwork.concurrency;

public class Threads {

//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(() -> System.out.println("Hello from " +
//                    Thread.currentThread().getName())).start();
//        }
//
//        System.out.println("Hello from main");
//    }

    // -------------------------------------------------------------------------------------------

    public static class InterruptedWorkerThread extends Thread {

        @Override
        public void run() {
            long sum = 0;
            for (int i = 0; i < 10_000_000; i++) {
                sum += Math.sin(i);
                if (i % 100 == 0 && isInterrupted()) {
                    System.out.println("Worker interrupted: i = " + i + ", sum = " + sum);
                    break;
                }
            }
        }
    }

    public static class InterruptedSleeperThread extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                System.out.println("Sleeper interrupted");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new InterruptedWorkerThread();
        Thread sleeper = new InterruptedSleeperThread();

        System.out.println("Start");
        worker.start();
        sleeper.start();

        Thread.sleep(10);
        System.out.println("Interrupt");
        worker.interrupt();
        sleeper.interrupt();

        System.out.println("join");
        worker.join();
        sleeper.join();

        System.out.println("End");

    }

    // -------------------------------------------------------------------------------------------


}
