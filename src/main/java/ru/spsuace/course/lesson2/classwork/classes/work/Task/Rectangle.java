package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Rectangle extends Shape implements Perimeterable{
    double sideA;
    double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
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
