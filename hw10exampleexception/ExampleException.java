package hw10exampleexception;

public class ExampleException {
  /**
   * Finds the rectangle area or throws the newly created Exception.
   *
   * @param a length
   * @param b width
   * @return rectangle area
   */
  public static int rectangleArea(int a, int b) throws IllegalArgumentException {
    if (a > 0 && b > 0) {
      return a * b;
    } else {
      throw new IllegalArgumentException("input value is below zero!");
    }
  }
}