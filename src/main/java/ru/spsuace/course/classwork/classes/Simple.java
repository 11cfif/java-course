package ru.spsuace.course.classwork.classes;

import java.io.IOException;
import java.nio.file.Files;

public class Simple {

    public static void main(String[] args) {
        int result = forAction(12, 4, 8);
        System.out.println(result);
    }

    public static int forAction(int n, int minCount, int maxCount) {
        try {
            System.out.println("try 1");
            Files.readAllLines(null);
            System.out.println("try 2");
            return 10;
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("catch");
            return 11;
        } finally {
            System.out.println("finally");
            return 12;
        }
    }
}
