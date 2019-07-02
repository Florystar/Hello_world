package hw10exampleexception;

import static hw10exampleexception.ExampleException.rectangleArea;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

  /**
   * Test data for positive test.
   *
   * @return test data array
   */
  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 3, 6},
        {9, 8, 72},
        {5, 5, 25}
    };
  }

  /**
   * Test data for exception test.
   *
   * @return test data array
   */
  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {2, -2},
        {-10, -10},
        {5, -5},
        {0, 0}
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    assertEquals(rectangleArea(a,b), c, "Real Area is not equal to expected");
  }


  @Test(dataProvider = "negativeData")
  public void testRectangleAreaNegative(int a, int b) {
    try {
      rectangleArea(a,b);
    }      catch (IllegalArgumentException e1) {
      assertEquals(e1.getMessage(),"input value is below zero!");
    }
  }
}


