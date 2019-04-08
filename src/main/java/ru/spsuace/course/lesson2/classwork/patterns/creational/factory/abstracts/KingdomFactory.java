package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.abstracts;

/**
 * KingdomFactory factory interface.
 */
public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();

}
