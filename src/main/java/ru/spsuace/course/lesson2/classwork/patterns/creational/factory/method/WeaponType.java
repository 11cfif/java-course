package ru.spsuace.course.lesson2.classwork.patterns.creational.factory.method;

/**
 *
 * WeaponType enumeration
 *
 */
public enum WeaponType {

    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("");

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
