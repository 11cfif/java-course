package ru.spsuace.course.lesson2.classwork.classes.work;

public interface Measurable3D {

    double measure3D();

    //Площадь поверхности
    double area();

    public class Cube extends FigureOne implements Measurable3D{

        Cube(double a){

            super(a);
        }

        public double measure3D() {

            return Math.pow(attribute1 ,3.);
        }

        public double area() {

            return 6 * Math.pow(attribute1, 2.);
        }
    }

    class Sphere extends FigureOne implements Measurable3D{

        Sphere(double r){

            super(r);
        }

        public double measure3D() {

            return 4. / 3. * Math.PI * Math.pow(attribute1, 3.);
        }

        public double area() {

            return 4 * Math.PI * Math.pow(attribute1, 2.);
        }
    }
}