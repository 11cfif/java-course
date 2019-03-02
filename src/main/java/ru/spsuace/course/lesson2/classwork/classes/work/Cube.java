package ru.spsuace.course.lesson2.classwork.classes.work;

public class Cube extends Figure implements Measurable2D, Volume {
    double a;

    Cube(double a) {
        super(a);
    }

    @Override
    public double measure2D() {
        return 6 * a * a;
    }

    @Override
    public double volumeCalc() {
        return a * a * a;
    }

    @Override
    public double perimeter() {
        return 12 * a;
    }
}
