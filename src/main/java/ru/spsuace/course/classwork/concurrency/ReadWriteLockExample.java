package ru.spsuace.course.classwork.concurrency;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private int value;
    ReadWriteLock lock = new ReentrantReadWriteLock();

    public void setValue(int value) throws InterruptedException {
        try {
            lock.writeLock().lock();
            System.out.println("lock set" + Thread.currentThread().getName());
            Thread.sleep(3000);
            this.value = value;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int getValue() throws InterruptedException {
        try {
            lock.readLock().lock();
            System.out.println("lock get" + Thread.currentThread().getName());

            Thread.sleep((long) (new Random().nextDouble() * 3000));
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        Executor executor = Executors.newFixedThreadPool(10);
        ReadWriteLockExample example = new ReadWriteLockExample();
        for (int i = 0; i < 10; i++) {
            executor.execute(example.createRunnable(i, countDownLatch));
        }
    }

    private Runnable createRunnable(int i, CountDownLatch countDownLatch) {
        return () -> {
            countDownLatch.countDown();
            try {
                countDownLatch.await();
                if (i % 5 == 0) {
//                    System.out.println("Write");
//                    setValue(i);
                } else {
                    getValue();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}
