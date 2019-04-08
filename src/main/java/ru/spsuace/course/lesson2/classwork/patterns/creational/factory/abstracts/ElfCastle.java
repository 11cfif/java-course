package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.abstracts;

/**
 * ElfCastle
 */
public class ElfCastle implements Castle {

    static final String DESCRIPTION = "This is the Elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
