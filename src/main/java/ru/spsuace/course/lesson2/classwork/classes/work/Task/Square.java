package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class Square extends Shape implements Perimeterable{

    double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }


}
