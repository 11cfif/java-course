package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Rectangle extends Square {
    double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color, sideA);
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideB * sideA;
    }

    @Override
    public double perimeter() {
        return 2 * sideB + 2 * sideA;
    }
}
