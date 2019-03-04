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
    double measure2D(); //Площадь
    double perimeter(); //Периметр

    //Круг
    public class Circle implements Measurable2D {

        protected int r;

        Circle(int r) {
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

    //Квадрат
    public class Square implements Measurable2D {
        protected int a;

        Square(int a) {
            this.a = a;
        }

        @Override
        public double measure2D() {
            return a * a;
        }

        @Override
        public double perimeter() {
            return 4 * a;
        }
    }

    //Прямоугольник
    public class Rectangle extends Square {
        protected int b;

        Rectangle(int a, int b) {
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

    //Прямоугольный треугольник
    public class RightTriangle extends Rectangle{

        RightTriangle(int a, int b){
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

    public interface Measurable3D extends Measurable2D{
        double volume(); //Объем
    }

    public class Ball extends Circle implements Measurable3D{

        Ball(int r) {
            super(r);
        }

        @Override
        public double measure2D() {
            return 0;
        }

        @Override
        public double perimeter() {
            return 0;
        }

        @Override
        public double volume() {
            return 4 / 3 * Math.PI * Math.pow(r, 3);
        }
    }


    public class Cube extends Square implements Measurable3D{
        Cube(int a){
            super(a);
        }

        @Override
        public double measure2D() {
            return 6 * a * a;
        }

        @Override
        public double perimeter() {
            return 12 * a;
        }

        @Override
        public double volume() {
            return Math.pow(a, 3);
        }
    }

}
