package ru.spsuace.course.classwork.patterns.creational.factory.abstracts;

/**
 * KingdomFactory factory interface.
 */
public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();

}
