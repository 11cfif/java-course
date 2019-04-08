package ru.spsuace.course.lesson2.classwork.patterns.creational.builder;

public enum Profession {

    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}