package ru.spsuace.course.lesson2.classwork.classes.work;

public interface Measurable3D {
    double measure3D();//Объем

    double area();//Площадь поверхности

    public class Cube implements Measurable3D {
        private double a;

        Cube(double a) {
            this.a = a;
        }

        @Override
        public double measure3D() {
            return Math.pow(a, 3);
        }

        @Override
        public double area() {
            return 6 * Math.pow(a, 2);
        }
    }

    public class Round implements Measurable3D {
        private double r;

        Round(double r) {
            this.r = r;
        }

        @Override
        public double measure3D() {
            return 4 / 3 * Math.PI * Math.pow(r, 3);
        }

        @Override
        public double area() {
            return 4 * Math.PI * Math.pow(r, 2);
        }
    }
}
