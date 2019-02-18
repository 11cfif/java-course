package ru.spsuace.course.lesson2.classwork.classes.work;

public class Cube extends Shape implements iShape {
    protected double side;


    public Cube(String name, double side) {
        super(name);
        this.side = side;

    }

    @Override
    public double sqareShape() {
        return this.side * this.side * 6;
    }


    @Override
    public double perimeter() {
        return 12 * this.side;
    }

    @Override
    public double volumeShape() {
        return Math.pow(this.side, 3);
    }

}
