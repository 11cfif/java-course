package ru.spsuace.course.lesson2.classwork.classes.work;

public class StraightTriangle extends ThreeVarFigure implements Measurable2D {
    StraightTriangle(double a, double b, double c) {
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
