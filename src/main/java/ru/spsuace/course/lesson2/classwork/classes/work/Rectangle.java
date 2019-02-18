package ru.spsuace.course.lesson2.classwork.classes.work;

public class Rectangle extends Shape implements iShape {
    protected double sideA;
    protected double sideB;

    public Rectangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double sqareShape() {
        return this.sideA * this.sideB;
    }


    @Override
    public double perimeter() {
        return 2 * (this.sideA + this.sideB);
    }

    @Override
    public double volumeShape() {
        return 0;
    }

}