package ru.spsuace.course.lesson2.classwork.classes.work;

/**
 * Задание:
 * Сделать иерархию классов, в котором можно сделать измерять площадь поверзности, периметр и объем
 * (для него сделайте отдельный интерфейс). Фигуры, которые будут участвовать в измерении - квадрат, круг, прямоугольник,
 * прямой треугольник, шар, куб.
 */

//Интерфейс, который позволяет измерять площадь поверхности объектов и периметр
public interface Measurable2D {
    //Площадь
    double measure2D();

    //Периметр
    double perimeter();

    //класс круг
    public class Circle implements Measurable2D {
        //радиус
        protected double r;

        //конструктор
        Circle(double r) {
            this.r = r;
        }

        //площадь круга
        @Override
        public double measure2D() {
            return (Math.PI * Math.pow(r, 2));
        }

        //периметр круга
        @Override
        public double perimeter() {
            return (2 * Math.PI * r);
        }
    }

    //класс квадрат
    public class Square implements Measurable2D {
        //длина стороны квадрата
        protected double a;

        //конструктор
        Square(double a) {
            this.a = a;
        }

        //площадь квадрата
        @Override
        public double measure2D() {
            return Math.pow(a, 2);
        }

        //периметр квадрата
        @Override
        public double perimeter() {
            return (4 * a);
        }
    }

    //класс прямоугольник
    public class Rectangle extends Square implements Measurable2D {
        //длина второй стороны прямоугольника
        protected double b;

        //конструктор
        Rectangle(double a, double b) {
            super(a);
            this.b = b;
        }

        //площадь прямоугольника
        @Override
        public double measure2D() {
            return (a * b);
        }

        //периметр прямоугольника
        @Override
        public double perimeter() {
            return (2 * a + 2 * b);
        }
    }

    //класс прямоугольный треугольник
    public class Triangle90 implements Measurable2D {
        //длины катетов прямоугольного треугольника
        protected double a, b;

        //конструктор
        Triangle90(double a, double b) {
            this.a = a;
            this.b = b;
        }

        //площадь прямоугольного треугольника
        @Override
        public double measure2D() {
            return (a * b / 2);
        }

        //периметр прямоугольного треугольника
        @Override
        public double perimeter() {
            return (a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        }
    }
}