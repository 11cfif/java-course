package ru.spsuace.course.lesson2.classwork.classes.work;

public class Ball extends OneVarFigure implements Measurable2D, Volume {

    Ball(double a) {
        super(a);
    }

    @Override
    public double measure2D() {
        return 4 * Math.PI * Math.pow(a, 2);
    }

    @Override
    public double volumeCalc() {
        return 4 / 3 * Math.PI * Math.pow(a, 3);
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Invalid operation for Ball.");
    }
}
