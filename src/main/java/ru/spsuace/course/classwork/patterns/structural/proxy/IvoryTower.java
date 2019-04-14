package ru.spsuace.course.classwork.patterns.structural.proxy;


/**
 * The object to be proxyed.
 */
public class IvoryTower implements WizardTower {


    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower.");
    }

}
