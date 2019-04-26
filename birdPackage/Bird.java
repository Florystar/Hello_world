package birdPackage;

public abstract class Bird {
  public Bird() {}

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
