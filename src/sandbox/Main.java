// This is oyur project!!!!!



package sandbox;

import sandbox.Calculator.IntegerMath;

public class Main {

  public static void main(String[] args) {
    //Scanner scan = new Scanner(System.in);

    //demoToStringOverride();
    //demoAbstractClass();
    //demoFinal();
    //demoLocalClass();
    //demoNestedClass();
    //demoInterfaceImplementation();
    //demoEnum();
    LambdaExpressions.demoLambda();
    //Generics.genericDemo();
    //HashSetDemo.demoHashSet();

  }

  public static void demoToStringOverride() {
    // override toString
    Automobile myAuto = new Automobile("Tesla");
    System.out.println(myAuto.toString());

    Automobile myAuto2 = new Automobile("Honda");
    System.out.println(myAuto2.toString());
  }

  public static void demoAbstractClass() {

    // AbstractClass cannot be instantiated
    // AbstractClass abClass = new AbstractClass();
    ConcreteClass conClass = new ConcreteClass();
    conClass.printAbstractInfo();

  }

  public static void demoFinal() {
    FinalDemo.finalDemo();
  }

  public static void demoLocalClass() {
    // Local classe are classes that are defined in a block,
    // which is a group of zero or more statements between balanced braces.
    // You typically find local classes defined in the body of a method.

    sayGoodbyeInEnglish();
  }

  public static void sayGoodbyeInEnglish() {
    class EnglishGoodbye {
      public static final String farewell = "Bye bye";
      public void sayGoodbye() {
        System.out.println(farewell);
      }
    }
    EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
    myEnglishGoodbye.sayGoodbye();
  }

  public static void demoInterfaceImplementation() {

    RectanglePlus rect1 = new RectanglePlus(5, 5);
    RectanglePlus rect2 = new RectanglePlus(6, 6);
    if (rect1.isLargerThan(rect2) == 1) {
      System.out.println("rect1 is larger");
    } else if (rect1.isLargerThan(rect2) == -1) {
      System.out.println("rect2 is larger");
    } else {
      System.out.println("the rectangles are the same size");
    }

  }

  public static void demoEnum() {

    // Basic enum
    // The enum is like a data type
    Day day;

    day = Day.MONDAY;

    switch (day) {
      case SUNDAY:

        break;
      case MONDAY:
        break;
      case TUESDAY:
        break;
      case WEDNESDAY:
        break;
      case THURSDAY:
        break;
      case FRIDAY:
        break;
      case SATURDAY:
        break;
    }

    System.out.println("Check your weight on another planet");
    System.out.println("Enter your weight on Earth in pounds");

    double earthWeight;

    // comment / uncomment these sections for testing

    // for user input
    //Scanner scanner = new Scanner(System.in);
    //earthWeight = scanner.nextDouble();
    //scanner.close();

    // for quick testing
    earthWeight = 200;

    double mass = earthWeight / Planet.EARTH.surfaceGravity();
    // The compiler automatically adds some special methods when it creates an enum. For example,
    // they have a static values method that returns an array containing all of the values of the
    // enum in the order they are declared.
    // https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
    for (Planet p : Planet.values()) {
      System.out.printf("Your weight on %s is %f%n",
          p, p.surfaceWeight(mass));
    }

    }

  public static void demoNestedClass() {
    NestedClass n = new NestedClass();
    n.getOuterClassField();

    //InnerClass i = new InnerClass(); // illegal

  }


}
