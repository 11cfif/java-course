package ru.spsuace.course.lesson2.classwork.classes.work;

public class Ball extends Figure implements Measurable2D, Volume {

    protected double radius;

    Ball(double radius) {
        super(radius);
    }

    @Override
    public double measure2D() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volumeCalc() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

}
