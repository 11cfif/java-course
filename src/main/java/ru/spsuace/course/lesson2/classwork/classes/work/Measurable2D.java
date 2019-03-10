package ru.spsuace.course.lesson2.classwork.classes.work;

/**
 *
 * Задание:
 * Сделать иерархию классов, в котором можно сделать измерять площадь поверзности, периметр и объем
 * (для него сделайте отдельный интерфейс). Фигуры, которые будут участвовать в измерении - квадрат, круг, прямоугольник,
 * прямой треугольник, шар, куб.
 *
 *
 * Интерфейс, который позволяет измерять площадь поверхности объектов и периметр
 */
public interface Measurable2D {
    double measure2D();

    double perimeter();

    public class Square implements Measurable2D {
        protected double a;

        Square(double a) {
            this.a = a;
        }

        @Override
        public double measure2D() {
            return Math.Pow(a, 2);
        }

        @Override
        public double perimeter() {
            return (4 * a);
        }
    }

    public class Circle implements Measurable2D {
        protected double r;

        Circle(double r) {
            this.r = r;
        }

        @Override
        public double measure2D() {
            return (Math.PI * Math.Pow(r, 2));
        }

        @Override
        public double perimeter() {
            return (2 * Math.PI * r);
        }
    }

    public class Rectangle extends Square implements Measurable2D {
        protected double b;

        Rectangle(double a, double b) {
            super(a);
            this.b = b;
        }

        @Override
        public double measure2D() {
            return (a * b);
        }

        @Override
        public double perimeter() {
            return (2 * a + 2 * b);
        }
    }

    public class StraightTriangle implements Measurable2D {
        protected double a, b;

        StraightTriangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public double measure2D() {
            return (a * b / 2);
        }

        @Override
        public double perimeter() {
            return (a + b + Math.sqrt(Math.Pow(a, 2) + Math.Pow(b, 2)));
        }
    }
}

public interface Measurable3D extends Measurable2D {

    double volume();

    public class Ball extends Circle implements Measurable3D {
        Ball(double r) {
            super(r);
        }

        @Override
        public double measure2D() {
            return (4 * Math.PI * Math.Pow(r, 3));
        }

        @Override
        public double volume() {
            return (4 * Math.PI * Math.Pow(r, 3) / 3);
        }
    }

    public class Cube extends Square implements Measurable3D {
        Cube(double a) {
            super(a);
        }

        @Override
        public double measure2D() {
            return (6 * Math.Pow(a, 2));
        }

        @Override
        public double perimeter() {
            return (12 * a);
        }

        @Override
        public double volume() {
            return Math.Pow(a, 3);
        }
    }
}