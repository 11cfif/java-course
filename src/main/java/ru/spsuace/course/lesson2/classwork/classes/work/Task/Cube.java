package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Cube extends Shape implements Perimeterable {

    double side;

    public Cube(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }
}
