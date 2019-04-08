package ru.spsuace.course.lesson2.classwork.patterns.creational.builder;

public enum Weapon {

    DAGGER,
    SWORD,
    AXE,
    WARHAMMER,
    BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}