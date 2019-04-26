package birdPackage;

public class Eagle extends FlyingBird {
  public Eagle() {}

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
