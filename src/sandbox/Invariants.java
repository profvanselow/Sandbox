package sandbox;

// Assertions can be used to check internal logic:
//– Internal invariants - testing values and evaluations in your methods.
//– Control flow invariants
//– Class invariants
public class Invariants {

  public static void main(String[] args) {

    String numberAsString = convertNumber(1);
    assert (numberAsString.equals("One!")) : "Incorrect output!";
  }

  public static String convertNumber(int numberToConvert) {
    String returnString = "";
    switch (numberToConvert) {
      case 0:
        System.out.println("Zero!");
        returnString = "Zero!";
        break;
      case 1:
        System.out.println("One!");
        returnString = "One!";
        break;
      case 2:
        System.out.println("Two!");
        returnString = "Two!";
        break;
      case 3:
        System.out.println("Three!");
        returnString = "Three!";
        break;
      case 4:
        System.out.println("Four!");
        returnString = "Four!";
        break;
      default:
        assert false : "Invalid number!"; //– Control flow invariant
        break;
    }
    return returnString;
  }
}
