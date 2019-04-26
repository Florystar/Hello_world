package birdPackage;

public abstract class FlyingBird extends Bird {
  public FlyingBird(){}

  public void checkWings() {
    System.out.println("The bird wings are checked");
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
