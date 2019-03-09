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

    public class Square extends SingleParameterFigure implements Measurable2D {

        Square(double a) {

            super(a);
        }

        public double measure2D() {

            return Math.pow(attribute1, 2);
        }

        public double perimeter() {

            return 4 * attribute1;
        }
    }

    public class Circle extends SingleParameterFigure implements Measurable2D {

        Circle(double r) {

            super(r);
        }

        public double measure2D() {

            return Math.PI * Math.pow(attribute1, 2);
        }

        public double perimeter() {

            return 2 * Math.PI * attribute1;
        }
    }

    public class Rectangular extends TwoParametersFigure implements Measurable2D {

        Rectangular(double a, double b) {

            super(a, b);
        }

        public double measure2D() {

            return attribute1 * attribute2;
        }

        public double perimeter() {

            return 2 * (attribute1 + attribute2);
        }
    }

    public class RightTriangle extends TwoParametersFigure implements Measurable2D {

        RightTriangle(double a, double b) {

            super(a, b);
        }

        public double measure2D() {

            return (attribute1 * attribute2) / 2;
        }

        public double perimeter() {

            return attribute1 + attribute2 + Math.sqrt(Math.pow(attribute1, 2) + Math.pow(attribute2, 2));
        }
    }
}