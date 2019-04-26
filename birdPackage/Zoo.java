package birdPackage;

import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type
   */
  public static void feed(List<? extends Bird> list) {
    System.out.println("Feeding birds");
    showList(list);

  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type
   * @param bird new bird
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Accepting bird to a section");
    bird.checkWings();
    list.add(bird);
    showList(list);
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds
   * @param newBird bird to add
   */
  public static void registerBird(List<? super Bird> list, Bird newBird) {
    System.out.println("Adding bird to the birds list");
    list.add(newBird);
    showList(list);
  }

  /**
   * Printing birds with a cycle.
   *
   * @param list    list of birds
   */
  public static void showList(List<?> list) {
    for (Object value: list) {
      System.out.println(value);
    }
  }
}