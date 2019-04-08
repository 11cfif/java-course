package ru.spsuace.course.lesson2.classwork.patterns.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HeroTest {

    @Test(expected = IllegalArgumentException.class)
    public void testMissingProfession() {
        new Hero.Builder(null, "Sir without a job");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMissingName() {
        new Hero.Builder(Profession.THIEF, null);
    }

    @Test
    public void testBuildHero() {
        final String heroName = "Sir Lancelot";

        final Hero hero = new Hero.Builder(Profession.WARRIOR, heroName)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .withHairType(HairType.LONG_CURLY)
                .withHairColor(HairColor.BLOND)
                .build();

        assertNotNull(hero);
        assertNotNull(hero.toString());
        assertEquals(Profession.WARRIOR, hero.getProfession());
        assertEquals(heroName, hero.getName());
        assertEquals(Armor.CHAIN_MAIL, hero.getArmor());
        assertEquals(Weapon.SWORD, hero.getWeapon());
        assertEquals(HairType.LONG_CURLY, hero.getHairType());
        assertEquals(HairColor.BLOND, hero.getHairColor());

    }

}