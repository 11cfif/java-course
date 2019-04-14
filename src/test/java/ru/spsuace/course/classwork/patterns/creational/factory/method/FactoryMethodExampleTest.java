package ru.spsuace.course.classwork.patterns.creational.factory.method;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMethodExampleTest {

    /**
     * Testing {@link OrcBlacksmith} to produce a SPEAR asserting that the Weapon is an instance
     * of {@link OrcWeapon}.
     */
    @Test
    public void testOrcBlacksmithWithSpear() {
        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        verifyWeapon(weapon, WeaponType.SPEAR, OrcWeapon.class);
    }

    /**
     * Testing {@link OrcBlacksmith} to produce an AXE asserting that the Weapon is an instance
     *  of {@link OrcWeapon}.
     */
    @Test
    public void testOrcBlacksmithWithAxe() {
        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        verifyWeapon(weapon, WeaponType.AXE, OrcWeapon.class);
    }

    /**
     * Testing {@link ElfBlacksmith} to produce a SHORT_SWORD asserting that the Weapon is an
     * instance of {@link ElfWeapon}.
     */
    @Test
    public void testElfBlacksmithWithShortSword() {
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
        verifyWeapon(weapon, WeaponType.SHORT_SWORD, ElfWeapon.class);
    }

    /**
     * Testing {@link ElfBlacksmith} to produce a SPEAR asserting that the Weapon is an instance
     * of {@link ElfWeapon}.
     */
    @Test
    public void testElfBlacksmithWithSpear() {
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        verifyWeapon(weapon, WeaponType.SPEAR, ElfWeapon.class);
    }

    /**
     * This method asserts that the weapon object that is passed is an instance of the clazz and the
     * weapon is of type expectedWeaponType.
     *
     * @param weapon weapon object which is to be verified
     * @param expectedWeaponType expected WeaponType of the weapon
     * @param clazz expected class of the weapon
     */
    private void verifyWeapon(Weapon weapon, WeaponType expectedWeaponType, Class<?> clazz) {
        assertTrue("Weapon must be an object of: " + clazz.getName(), clazz.isInstance(weapon));
        assertEquals("Weapon must be of weaponType: " + expectedWeaponType, expectedWeaponType, weapon.getWeaponType());
    }

}