package ru.spsuace.course.lesson2.classwork.classes.work;

/**
 * Задание:
 * Сделать иерархию классов, в котором можно сделать измерять площадь поверзности, периметр и объем
 * (для него сделайте отдельный интерфейс). Фигуры, которые будут участвовать в измерении - квадрат, круг, прямоугольник,
 * прямой треугольник, шар, куб.
 */

//Интерфейс, который позволяет измерять объём объектов
public interface Measurable3D extends Measurable2D {
    //Объём
    double measure3D();

    //класс шар
    public class Ball extends Circle implements Measurable3D {
        //конструктор
        Ball(double r) {
            super(r);
        }

        //площадь шара
        @Override
        public double measure2D() {
            return (4 * Math.PI * Math.pow(r, 3));
        }

        //объём шара
        @Override
        public double measure3D() {
            return (4 * Math.PI * Math.pow(r, 3) / 3);
        }
    }

    //класс куб
    public class Cube extends Square implements Measurable3D {
        //конструктор
        Cube(double a) {
            super(a);
        }

        //площадь куба
        @Override
        public double measure2D() {
            return (6 * Math.pow(a, 2));
        }

        //периметр куба
        @Override
        public double perimeter() {
            return (12 * a);
        }

        //объём куба
        @Override
        public double measure3D() {
            return Math.pow(a, 3);
        }
    }
}