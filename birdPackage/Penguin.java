package birdPackage;

public class Penguin extends NonFlyingBird {
  public Penguin() {}

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
