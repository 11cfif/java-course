package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.abstracts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryExampleTest {
    private AbstractFactoryExample factoryExample = new AbstractFactoryExample();
    private KingdomFactory elfFactory;
    private KingdomFactory orcFactory;

    @Before
    public void setUp() {
        elfFactory = AbstractFactoryExample.FactoryMaker.makeFactory(AbstractFactoryExample.FactoryMaker.KingdomType.ELF);
        orcFactory = AbstractFactoryExample.FactoryMaker.makeFactory(AbstractFactoryExample.FactoryMaker.KingdomType.ORC);
    }

    @Test
    public void king() {
        final King elfKing = factoryExample.getKing(elfFactory);
        assertTrue(elfKing instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, elfKing.getDescription());
        final King orcKing = factoryExample.getKing(orcFactory);
        assertTrue(orcKing instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, orcKing.getDescription());
    }

    @Test
    public void castle() {
        final Castle elfCastle = factoryExample.getCastle(elfFactory);
        assertTrue(elfCastle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, elfCastle.getDescription());
        final Castle orcCastle = factoryExample.getCastle(orcFactory);
        assertTrue(orcCastle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, orcCastle.getDescription());
    }

    @Test
    public void army() {
        final Army elfArmy = factoryExample.getArmy(elfFactory);
        assertTrue(elfArmy instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, elfArmy.getDescription());
        final Army orcArmy = factoryExample.getArmy(orcFactory);
        assertTrue(orcArmy instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, orcArmy.getDescription());
    }

    @Test
    public void createElfKingdom() {
        factoryExample.createKingdom(elfFactory);
        final King king = factoryExample.getKing();
        final Castle castle = factoryExample.getCastle();
        final Army army = factoryExample.getArmy();
        assertTrue(king instanceof ElfKing);
        assertEquals(ElfKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof ElfCastle);
        assertEquals(ElfCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof ElfArmy);
        assertEquals(ElfArmy.DESCRIPTION, army.getDescription());
    }

    @Test
    public void createOrcKingdom() {
        factoryExample.createKingdom(orcFactory);
        final King king = factoryExample.getKing();
        final Castle castle = factoryExample.getCastle();
        final Army army = factoryExample.getArmy();
        assertTrue(king instanceof OrcKing);
        assertEquals(OrcKing.DESCRIPTION, king.getDescription());
        assertTrue(castle instanceof OrcCastle);
        assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
        assertTrue(army instanceof OrcArmy);
        assertEquals(OrcArmy.DESCRIPTION, army.getDescription());
    }
}