package ru.spsuace.course.lesson2.classwork.classes.work;

/**
 * Задание:
 * Сделать иерархию классов, в котором можно сделать измерять площадь поверзности, периметр и объем
 * (для него сделайте отдельный интерфейс). Фигуры, которые будут участвовать в измерении - квадрат, круг, прямоугольник,
 * прямой треугольник, шар, куб.
 * <p>
 * <p>
 * Интерфейс, который позволяет измерять площадь поверхности объектов и периметр
 */
public interface Measurable2D {


    /**
     * Площадь
     *
     * @return
     */
    double measure2D();

    /**
     * Периметр
     *
     * @return
     */
    double perimeter();

    public interface Measurable3D extends Measurable2D {
        double volume();
    }

    public static abstract class Shape {
        private String name;

        public Shape(String name) {
            this.name = name;
        }
    }

    public static abstract class RectangularShape extends Shape {
        private double sideA;


        public RectangularShape(String name, double sideA) {
            super(name);
            this.sideA = sideA;
        }


    }

    public static abstract class SphericalShape extends Shape {
        private double radius;

        public SphericalShape(String name, double radius) {
            super(name);
            this.radius = radius;
        }
    }

    public class Rectangle extends RectangularShape implements Measurable2D {
        private double sideB;

        public Rectangle(String name, double sideA, double sideB) {
            super(name, sideA);
            this.sideB = sideB;
        }

        @Override
        public double measure2D() {
            return sideA * sideB;
        }

        @Override
        public double perimeter() {
            return 2 * (sideA + sideB);
        }
    }

    public class Square extends RectangularShape implements Measurable2D {

        public Square(String name, double side) {
            super(name, side);
        }

        @Override
        public double measure2D() {
            return sideA * sideA;
        }

        @Override
        public double perimeter() {
            return 4 * sideA;
        }
    }

    public class Circle extends SphericalShape implements Measurable2D {

        public Circle(String name, double radius) {
            super(name, radius);
        }

        @Override
        public double measure2D() {
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public class RightTriangle extends Shape implements Measurable2D {
        private double sideA;
        private double sideB;

        public RightTriangle(String name, double sideA, double sideB) {
            super(name);
            this.sideA = sideA;
            this.sideB = sideB;
        }

        @Override
        public double measure2D() {
            return sideA * sideB / 2;
        }

        @Override
        public double perimeter() {
            return sideA + sideB + Math.sqrt(sideA * sideA + sideB * sideB);
        }
    }

    public class Sphere extends SphericalShape implements Measurable3D {


        public Sphere(String name, double radius) {
            super(name, radius);
        }

        @Override
        public double measure2D() {
            return 4 * Math.PI * radius * radius;
        }

        @Override
        public double volume() {
            return 4 / 3 * Math.PI * Math.pow(radius, 3);
        }

        @Override
        public double perimeter() {
            System.out.println("Периметр этой фигуры посчитать невозможно");
            return 0;
        }
    }


    public class Cube extends RectangularShape implements Measurable3D {


        public Cube(String name, double side) {
            super(name, side);
        }

        @Override
        public double measure2D() {
            return Math.pow(side, 2) * 6;
        }

        @Override
        public double perimeter() {
            return 12 * side;
        }

        @Override
        public double volume() {
            return Math.pow(side, 2);
        }
    }

}


