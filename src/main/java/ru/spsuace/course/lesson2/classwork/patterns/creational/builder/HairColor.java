package ru.spsuace.course.lesson2.classwork.patterns.creational.builder;

public enum HairColor {

    WHITE,
    BLOND,
    RED,
    BROWN,
    BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}