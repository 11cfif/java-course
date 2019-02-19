package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Square extends Shape implements Perimeterable {

    double sideA;

    public Square(String color, double side) {
        super(color);
        this.sideA = side;
    }

    @Override
    public double perimeter() {
        return sideA * 4;
    }

    @Override
    public double area() {
        return Math.pow(sideA, 2);
    }


}
