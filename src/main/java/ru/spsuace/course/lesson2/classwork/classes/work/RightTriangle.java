package ru.spsuace.course.lesson2.classwork.classes.work;

public class RightTriangle extends Shape implements iShape {
    protected double sideA;
    protected double sideB;

    public RightTriangle(String name, double sideA, double sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double sqareShape() {
        return this.sideA * this.sideB / 2;
    }


    @Override
    public double perimeter() {
        return (this.sideA + this.sideB) + Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
    }

    @Override
    public double volumeShape() {
        return 0;
    }

}
