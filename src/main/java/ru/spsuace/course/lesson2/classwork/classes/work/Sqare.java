package ru.spsuace.course.lesson2.classwork.classes.work;

public class Sqare extends Shape implements iShape {
    double side;

    public Sqare(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double sqareShape() {
        return this.side * this.side;
    }


    @Override
    public double perimeter() {
        return 4 * this.side;
    }

    @Override
    public double volumeShape() {
        return 0;
    }
}