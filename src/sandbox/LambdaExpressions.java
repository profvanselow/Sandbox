package sandbox;

import sandbox.Calculator.IntegerMath;

public class LambdaExpressions {

  public static void demoLambda() {

    // A lambda expression consists of the following:
    //
    // A comma-separated list of formal parameters enclosed in parentheses.
    //
    // The arrow token, ->
    //
    // A body, which consists of a single expression or a statement block
    //
    // Note: You can omit the data type of the parameters in a lambda expression.
    // In addition, you can omit the parentheses if there is only one parameter.

    // Demonstration of non-functional way of calling printIt
    // by creating a concrete class object.
    MyInterfaceImplementation mii = new MyInterfaceImplementation();
    mii.printIt("Lame way");

    // Another way, with an "anonymous interface implementation".
    // No object of a class that implements the interface is created.
    MyInterface mi1 = new MyInterface() {
      public void printIt(String text) {
        System.out.println(text);
      }
    };
    mi1.printIt("Anonymous way");

    // Code written using an anonymous interface implementation can
    // be converted to a lambda expression.
    // methodUsingYourClass(new YourClass() {
    //    public void uniqueMethod(Type1 parameter1, Type2 parameter2) {
    //        // body of function
    //    }
    // });
    // is replaced with
    //
    // methodUsingYourClass((Type1 parameter1, Type2 parameter2) -> {
    //    // body of function
    // });
    // https://stackoverflow.com/questions/37695456/how-to-replace-anonymous-with-lambda-in-java

    // Demonstration of implementing with a lambda expression using
    // the format described above: parameters, arrow, body.
    // This format (with braces) is called a "statement lambda".
    MyInterface mi2 = (String text) -> {
      System.out.println(text);
    };
    mi2.printIt("Cool lambda way");

    // Parameter type can be omitted. Wild!
    MyInterface mi3 = (text) -> {
      System.out.println(text);
    };
    mi3.printIt("Cooler way");

    // When it's just one line, the braces and semicolon
    // can be omitted. Super Wild!
    // This format (without braces) is called an "expression lambda".
    MyInterface mi4 = (text) -> System.out.println(text); System.out.println("test");
    mi4.printIt("Coolest way");

    // When a lambda expression does nothing but call an existing method the
    // expression lambda can be replaced with a method reference. Mind Blown!
    MyInterface mi5 = System.out::println;
    mi5.printIt("Cooler than cool");
    demoCalculatorLambda();
  }

  public static void demoCalculatorLambda() {

    Calculator myApp = new Calculator();

    // implement IntegerMath interface with addition and
    // subtraction IntegerMath objects from Calculator

    // a shorter way of writing something like...
    //   Class Add implements IntegerMath {
    //     public int addition(int a, int b) {
    //       return a + b;
    //     }
    //   }

    IntegerMath addition = (a, b) -> a + b;
    IntegerMath subtraction = (a, b) -> a - b;

    System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
    System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
  }
}

// Considered a "functional interface" since it just has
// an abstract function (method)
interface MyInterface {

  public void printIt(String text);

}

// Without using lambdas, the interface would need to be
// implemented with a concrete class.
class MyInterfaceImplementation implements MyInterface {

  @Override
  public void printIt(String text) {
    System.out.println(text);
  }

}