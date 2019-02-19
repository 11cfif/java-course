package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Cube extends Square {

    public Cube(String color, double sideA) {
        super(color, sideA);
    }

    @Override
    public double area() {
        return 6 * Math.pow(sideA, 2);
    }

    @Override
    public double perimeter() {
        return 12 * sideA;
    }
}
