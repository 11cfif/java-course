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

    // Квадрат
    public class Sq implements Measurable2D {
        protected double a;

        Sq(double s) {
            this.a = a;
        }

        @Override
        public double perimeter() {
            return (4 * a);
        }

        @Override
        public double measure2D() {
            return Math.pow(a, 2);
        }
    }

    // Круг
    public class сircle implements Measurable2D {
        protected double r;

        сircle(double r) {
            this.r = r;
        }

        @Override
        public double perimeter() {
            return (2 * Math.PI * r);
        }

        @Override
        public double measure2D() {
            return (Math.PI * Math.pow(r, 2));
        }
    }

    //Прямоугольник
    public class Rect extends Sq implements Measurable2D {
        protected double b;

        Rect(double a, double b) {
            super(a);
            this.b = b;
        }

        @Override
        public double perimeter() {
            return 2 * (a + b);
        }

        @Override
        public double measure2D() {
            return (a * b);
        }
    }

    //Прямоугольный треугольник
    public class Triangle implements Measurable2D {
        protected double a, b;

        Triangle(double a, double b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public double perimeter() {
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            return (a + b + c);
        }

        @Override
        public double measure2D() {
            return (a * b / 2);
        }
    }

    public interface Measurable3D extends Measurable2D {

        double V();

        //Шар
        public class Ball extends сircle implements Measurable3D {
            Ball(double r) {
                super(r);
            }

            @Override
            public double measure2D() {
                return (4 * Math.PI * Math.pow(r, 3));
            }

            @Override
            public double V() {
                return ((4 / 3) * Math.PI * Math.pow(r, 3));
            }
        }

        //Куб
        public class Cube extends Sq implements Measurable3D {
            Cube(double a) {
                super(a);
            }

            @Override
            public double perimeter() {
                return (12 * a);
            }

            @Override
            public double measure2D() {
                return (6 * Math.pow(a, 2));
            }

            @Override
            public double V() {
                return Math.pow(a, 3);
            }
        }
    }
}
