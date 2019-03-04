package ru.spsuace.course.lesson2.classwork.classes.work;

public class StraightTriangle extends TwoVarFigure implements Measurable2D {
    StraightTriangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double measure2D() {
        return a * b / 2;
    }

    @Override
    public double perimeter() {
        return a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
