package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Ball extends Shape implements Volumable {

    double radius;

    public Ball(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
