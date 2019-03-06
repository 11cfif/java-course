package ru.spsuace.course.lesson2.classwork.classes.work;

public class Rectangle extends TwoVarFigure implements Measurable2D {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double measure2D() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
