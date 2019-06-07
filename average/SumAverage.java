package average;

/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    // TODO fill in code here using for loop and replace the return statement
    int sum1 = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      sum1 += i;
    }
    return sum1;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    // TODO fill in code here using for each loop and replace the return statement
    int sum2 = 0;
    for (int i : numbers) {
      sum2 += i;
    }
    return sum2;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    // TODO fill in code here using while loop and replace the return statement
    double sum3 = 0;
    int count3 = 0;
    int i = lowerBound;
    while (i <= upperBound) {
      sum3 += i;
      i++;
      count3++;
    }
    return sum3 / count3;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    // TODO fill in code here using do-while loop and replace the return statement
    double sum4 = 0;
    int count4 = 0;
    int i = 0;
    do {
      sum4 += numbers[i];
      ++count4;
      ++i;
    } while (i < numbers.length);
    return sum4 / count4;
  }
}
