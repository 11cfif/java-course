package ru.spsuace.course.lesson2.classwork.classes.work;

public class Circle extends Figure implements Measurable2D {
    protected double radius;
    Circle(double radius){
        super(radius);
    }

    @Override
    public double measure2D() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
