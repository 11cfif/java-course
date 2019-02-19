package ru.spsuace.course.lesson2.classwork.classes.work.Task;

public class MainForShapes {

    public static void main(String[] args){

        Cube cube = new Cube("Black", 4);
        System.out.println(cube.color + " Cube: perimeter= " + cube.perimeter() + ", area= " + cube.area());

        Circle circle = new Circle("Yellow", 7);
        System.out.println(circle.color + " Circle: perimeter= " + circle.perimeter() + ", area= " + circle.area());

        Ball ball = new Ball("Green", 11);
        System.out.println(ball.color + " Ball: area= " + ball.area() + ", valume= " + ball.volume());

        Rectangle rectangle = new Rectangle("Blue", 5, 18);
        System.out.println(rectangle.color + " Rectangle: perimeter= " + rectangle.perimeter() + ", area= " + rectangle.area());

        Square square = new Square("Pink", 6);
        System.out.println(square.color + " Square: perimeter= " + square.perimeter() + ", area= " + square.area());

        Triangle triangle = new Triangle("White", 4, 10);
        System.out.println(triangle.color + " Triangle: perimeter= " + triangle.perimeter() + ", area= " + triangle.area());
    }
}
