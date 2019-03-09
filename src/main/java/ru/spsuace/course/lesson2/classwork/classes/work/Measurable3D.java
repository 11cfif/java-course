package ru.spsuace.course.lesson2.classwork.classes.work;

public interface Measurable3D extends Measurable2D {

    double measure3D();

    public class Cube extends SingleParameterFigure implements Measurable3D {

        Cube(double a) {

            super(a);
        }

        public double measure3D() {

            return Math.pow(attribute1, 3);
        }

        public double measure2D() {

            return 6 * Math.pow(attribute1, 2);
        }

        public double perimeter() {

            return 12 * attribute1;
        }
    }

    public class Sphere extends SingleParameterFigure implements Measurable3D {

        Sphere(double r) {

            super(r);
        }

        public double measure3D() {

            return 4.0 / 3.0 * Math.PI * Math.pow(attribute1, 3);
        }

        public double measure2D() {

            return 4 * Math.PI * Math.pow(attribute1, 2);
        }

        public double perimeter() {

            throw new UnsupportedOperationException("Сфера не имеет периметра.");
        }
    }
}