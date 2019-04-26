package birdPackage;

public abstract class NonFlyingBird extends Bird {
  public NonFlyingBird() {}

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
