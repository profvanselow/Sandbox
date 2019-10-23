package sandbox;

public class Automobile {

  private String make;
  private String model;
  private int miles;

  public int getSpeeds() {
    return speeds;
  }

  public void setSpeeds(int speeds) {
    this.speeds = speeds;
  }

  protected int speeds;

  public Automobile(String m) {
    make = m;
  }

  public final String toString() {

  return super.toString() + "This automobile is a " + make;
   // return "This automobile is a " + make;

  }

}
