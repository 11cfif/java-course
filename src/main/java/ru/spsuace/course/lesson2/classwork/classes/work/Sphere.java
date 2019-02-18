package ru.spsuace.course.lesson2.classwork.classes.work;

public class Sphere extends Shape implements iShape {
    protected double radius;


    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;

    }

    @Override
    public double sqareShape() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }


    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volumeShape() {
        return 4 / 3 * Math.PI * Math.pow(this.radius, 3);
    }

}