package ru.spsuace.course.lesson2.classwork.classes.work;

public class Circle extends Shape implements iShape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double sqareShape() {
        return Math.PI * Math.pow(this.radius, 2);
    }


    @Override
    public double perimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public double volumeShape() {
        return 0;
    }

}
