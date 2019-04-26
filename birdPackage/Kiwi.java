package birdPackage;

public class Kiwi extends NonFlyingBird {
  public Kiwi() {}

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
