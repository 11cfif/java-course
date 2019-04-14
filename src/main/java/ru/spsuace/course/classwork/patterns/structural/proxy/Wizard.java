package ru.spsuace.course.classwork.patterns.structural.proxy;

/**
 * Wizard
 */
public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
