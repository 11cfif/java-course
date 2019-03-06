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

    double measure2D();

    double perimeter();

    public class Square implements Measurable2D {
        protected double a;

        Square(double a) {
            this.a = a;
        }

        @Override
        public double measure2D() {
            return Math.pow(a, 2);
        }

        @Override
        public double perimeter() {
            return 4 * a;
        }
    }

    public class Circle implements Measurable2D {
        protected double r;

        Circle(double r) {
            this.r = r;
        }

        @Override
        public double measure2D() {
            return Math.PI * Math.pow(r, 2);
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * r;
        }
    }

    public class Rectangle extends Square {
        protected double b;

        Rectangle(double a, double b) {
            super(a);
            this.b = b;
        }

        @Override
        public double measure2D() {
            return a * b;
        }

        @Override
        public double perimeter() {
            return 2 * (a + b);
        }
    }

    public class RightTriangle extends Rectangle {

        RightTriangle(double a, double b) {
            super(a, b);
        }

        @Override
        public double measure2D() {
            return 0.5 * a * b;
        }

        @Override
        public double perimeter() {
            return (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        }
    }
}