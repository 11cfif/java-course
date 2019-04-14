package ru.spsuace.course.classwork.patterns.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    @Test
    public void testToString() throws Exception {
        final String[] wizardNames = {"Gandalf", "Dumbledore", "Oz", "Merlin"};
        for (String name : wizardNames) {
            assertEquals(name, new Wizard(name).toString());
        }
    }
}