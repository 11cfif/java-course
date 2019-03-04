package ru.spsuace.course.lesson2.classwork.classes.work;

public class Square extends OneVarFigure implements Measurable2D {
    Square(double a) {
        super(a);
    }

    @Override
    public double measure2D() {
        return Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return a + a;
    }
}
