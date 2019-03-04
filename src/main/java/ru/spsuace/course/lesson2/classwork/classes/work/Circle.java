package ru.spsuace.course.lesson2.classwork.classes.work;

public class Circle extends OneVarFigure implements Measurable2D {
    Circle(double a) {
        super(a);
    }

    @Override
    public double measure2D() {
        return Math.PI * Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * a;
    }
}
