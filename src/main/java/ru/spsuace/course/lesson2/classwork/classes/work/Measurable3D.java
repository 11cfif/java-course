package ru.spsuace.course.lesson2.classwork.classes.work;

public interface Measurable3D extends Measurable2D {
    double measure3D();//Объем

    public class Cube extends Square implements Measurable3D {

        Cube(double a) {
            super(a);
        }

        @Override
        public double measure3D() {
            return Math.pow(a, 3);
        }

        @Override
        public double measure2D() {
            return 6 * Math.pow(a, 2);
        }

        @Override
        public double perimeter() {
            return 12 * a;
        }
    }

    public class Round extends Circle implements Measurable3D {

        Round(double r) {
            super(r);
        }

        @Override
        public double measure3D() {
            return 4 / 3 * Math.PI * Math.pow(r, 3);
        }

        @Override
        public double measure2D() {
            return 4 * Math.PI * Math.pow(r, 2);
        }

        @Override
        public double perimeter() {
            throw new UnsupportedOperationException("У шара не бывает периметра:)");
        }
    }
}
