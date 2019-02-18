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
    default double perimeter() {
        System.out.println("Периметр этой фигуры посчитать невозможно");
        return 0;
    }

    public interface Measurable3D extends Measurable2D {
        double volume();
    }

    public static abstract class Sheep {
        private String name;

        public Sheep(String name) {
            this.name = name;
        }
    }

    public static abstract class RectangularSheep extends Sheep {
        public double sideA;
        public double sideB;

        public RectangularSheep(String name, double sideA) {
            super(name);
            this.sideA = sideA;
        }

        public RectangularSheep(String name, double sideA, double sideB) {
            super(name);
            this.sideA = sideA;
            this.sideB = sideB;
        }
    }

    public static abstract class SphericalSheep extends Sheep {
        public double radius;

        public SphericalSheep(String name, double radius) {
            super(name);
            this.radius = radius;
        }
    }

    public class Rectangle extends RectangularSheep implements Measurable2D {

        public Rectangle(String name, double sideA, double sideB) {
            super(name, sideA, sideB);

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

    public class Square extends RectangularSheep implements Measurable2D {
        public double side;

        public Square(String name, double sideA) {
            super(name, sideA);

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

    public class Circle extends SphericalSheep implements Measurable2D {

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

    public class RightTriangle extends Sheep implements Measurable2D {
        public double sideA;
        public double sideB;

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

    public class Sphere extends SphericalSheep implements Measurable3D {


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
    }


    public class Cube extends Sheep implements Measurable3D {
        public double side;

        public Cube(String name, double side) {
            super(name);
            this.side = side;
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


