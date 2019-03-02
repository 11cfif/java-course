package ru.spsuace.course.lesson2.classwork.classes.work;

public class recSquare extends Figure implements Measurable2D {
    recSquare(double a) {
        super(a);
    }

    @Override
    public double measure2D() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return a+a;
    }
}
