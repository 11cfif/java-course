package ru.spsuace.course.lesson2.classwork.classes.work;

public class Rectangle extends Figure implements Measurable2D {
    protected double a, b;

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double measure2D() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return a + b;
    }
}
