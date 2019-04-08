package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.abstracts;

/**
 * OrcCastle
 */
public class OrcCastle implements Castle {

    static final String DESCRIPTION = "This is the Orc castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
