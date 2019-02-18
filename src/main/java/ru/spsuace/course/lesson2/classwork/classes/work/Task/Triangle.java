package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Triangle extends Shape implements  Perimeterable {

    double sideA;
    double sideB;

    public Triangle(String color, double sideA, double sideB) {
        super(color);
        this.sideB = sideB;
        this.sideA = sideA;
    }

    @Override
    public double area() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public double perimeter() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }
}
