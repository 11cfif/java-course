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


public class Measurable2D {


    public interface iShape {


        /**
         * Площадь
         *
         * @return
         */
        double sqareShape();

        /**
         * объем
         *
         * @return
         */
        double volumeShape();

        /**
         * Периметр
         *
         * @return
         */
        double perimeter();
    }

    protected abstract class Shape {
        public String name;


        public Shape(String name) {
            this.name = name;
        }
    }

    public class Sqare extends Shape implements iShape {
        protected double side;

        public Sqare(String name, double side) {
            super(name);
            this.side = side;
        }

        @Override
        public double sqareShape() {
            return this.side * this.side;
        }


        @Override
        public double perimeter() {
            return 4 * this.side;
        }

        @Override
        public double volumeShape() {
            return 0;
        }
    }

    public class Circle extends Shape implements iShape {
        protected double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double sqareShape() {
            return Math.PI * Math.pow(this.radius, 2);
        }


        @Override
        public double perimeter() {
            return Math.PI * 2 * this.radius;
        }

        @Override
        public double volumeShape() {
            return 0;
        }

    }


    public class Rectangle extends Shape implements iShape {
        protected double sideA;
        protected double sideB;

        public Rectangle(String name, double sideA, double sideB) {
            super(name);
            this.sideA = sideA;
            this.sideB = sideB;
        }

        @Override
        public double sqareShape() {
            return this.sideA * this.sideB;
        }


        @Override
        public double perimeter() {
            return 2 * (this.sideA + this.sideB);
        }

        @Override
        public double volumeShape() {
            return 0;
        }

    }


    public class RightTriangle extends Shape implements iShape {
        protected double sideA;
        protected double sideB;

        public RightTriangle(String name, double sideA, double sideB) {
            super(name);
            this.sideA = sideA;
            this.sideB = sideB;
        }

        @Override
        public double sqareShape() {
            return this.sideA * this.sideB / 2;
        }


        @Override
        public double perimeter() {
            return (this.sideA + this.sideB) + Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
        }

        @Override
        public double volumeShape() {
            return 0;
        }

    }


    public class Sphere extends Shape implements iShape {
        protected double radius;


        public Sphere(String name, double radius) {
            super(name);
            this.radius = radius;

        }

        @Override
        public double sqareShape() {
            return 4 * Math.PI * Math.pow(this.radius, 2);
        }


        @Override
        public double perimeter() {
            return 0;
        }

        @Override
        public double volumeShape() {
            return 4 / 3 * Math.PI * Math.pow(this.radius, 3);
        }

    }

    public class Cube extends Shape implements iShape {
        protected double side;


        public Cube(String name, double side) {
            super(name);
            this.side = side;

        }

        @Override
        public double sqareShape() {
            return this.side * this.side * 6;
        }


        @Override
        public double perimeter() {
            return 12 * this.side;
        }

        @Override
        public double volumeShape() {
            return Math.pow(this.side, 3);
        }

    }

}
