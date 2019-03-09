package ru.spsuace.course.lesson2.classwork.classes.work;

public abstract class TwoParametersFigure extends SingleParameterFigure {

    protected double attribute2;

    TwoParametersFigure(double a, double b){

        super(a);
        attribute2 = b;
    }

}
