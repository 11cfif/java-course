package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.abstracts;

/**
 * ElfKingdomFactory concrete factory.
 */
public class ElfKingdomFactory implements KingdomFactory {

    public Castle createCastle() {
        return new ElfCastle();
    }

    public King createKing() {
        return new ElfKing();
    }

    public Army createArmy() {
        return new ElfArmy();
    }

}
