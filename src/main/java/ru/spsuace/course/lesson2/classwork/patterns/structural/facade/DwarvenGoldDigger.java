package ru.spsuace.course.lesson2.classwork.patterns.structural.facade;

/**
 * 
 * DwarvenGoldDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {


  @Override
  public void work() {
    System.out.println(name() + " digs for gold.");
  }

  @Override
  public String name() {
    return "Dwarf gold digger";
  }
}
