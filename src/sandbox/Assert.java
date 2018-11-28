package sandbox;

public class Assert {

  public static void main(String[] args) {
    // If you are using IntelliJ IDEA enable assert by passing
    // VM Option '-ea' at following
    // Run > Edit Configurations... > Configuration > VM options:
    int x = 5;
    int y = 5;
    if (x > y) {
      System.out.println("x is greater");
    } else if (x < y) {
      System.out.println("y is greater");
    } else {
      assert (x != y); // throws exception
      //assert (x == y);  // must be equal
    }
    System.out.println("after assert"); //
  }
}
