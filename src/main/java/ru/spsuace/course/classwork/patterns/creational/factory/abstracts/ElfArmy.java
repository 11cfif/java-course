package ru.spsuace.course.classwork.patterns.creational.factory.abstracts;

/**
 * ElfArmy
 */
public class ElfArmy implements Army {

    static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
