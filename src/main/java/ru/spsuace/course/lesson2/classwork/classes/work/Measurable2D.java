package ru.spsuace.course.lesson2.classwork.classes.work;


/**
 * Задание:
 * Сделать иерархию классов, в котором можно измерять площадь поверхности, периметр и объем
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
    default double perimeter() {
        throw new UnsupportedOperationException("Invalid operation for Ball.");
    }
}

