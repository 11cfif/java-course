package ru.spsuace.course.lesson2.classwork.classes.work;

public class strTriangle extends Figure implements Measurable2D {
    protected double a, b, c;

    strTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double measure2D() {
        return a * b / 2;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
