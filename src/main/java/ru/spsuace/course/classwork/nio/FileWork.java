package ru.spsuace.course.classwork.nio;

import java.io.File;

public class FileWork {

    public static void main(String[] args) {

    }

    public static int removeDirectory(File file) {
        if (file == null || !file.exists()) {
            return -1;
        }
        if (file.isFile()) {
            file.delete();
            return 1;
        }
        int result = 0;
        for (File temp : file.listFiles()) {
            result += removeDirectory(temp);
        }
        file.delete();
        return result + 1;
    }
}
