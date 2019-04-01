package ru.spsuace.course.lesson2.classwork.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            new DemoThread(latch).start();
        }


    }

    private static class DemoThread extends Thread {
        private final CountDownLatch latch;

        private DemoThread(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                action();
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }

        private void action() throws InterruptedException {
            Thread.sleep((long) (Math.random() * 10_000L));

            System.out.println(getName() + " finish initialization");
            latch.countDown();
            latch.await();

            System.out.println(getName() + " main phase");

            Thread.sleep((long) (Math.random() * 10_000L));

        }
    }
}
