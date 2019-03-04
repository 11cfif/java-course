package ru.spsuace.course.lesson2.classwork.classes.work;

public class Cube extends OneVarFigure implements Measurable2D, Volume {
    Cube(double a) {
        super(a);
    }

    @Override
    public double measure2D() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double volumeCalc() {
        return Math.pow(a, 3);
    }

    @Override
    public double perimeter() {
        return 12 * a;
    }
}
