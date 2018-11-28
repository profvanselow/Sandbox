package sandbox;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Exceptions {

  public static void main(String[] args) {

    basicExample();

    multipleCatchExample();

    multiCatchExample();

    try {
      propagateExample();
    } catch (Exception ex) {
      System.out.println("Catch propagateExample");
    }

    try {
      printFile();
    } catch (IOException e) {
      System.out.println("Catch printFile");
    }

    try {
      printFileJava7();
    } catch (IOException e) {
      System.out.println("Catch printFileJava7");
    }

    //File infile = new File("myFile.txt");
    //FileInputStream in = null;
    //in = new FileInputStream(infile);

  }

  private static void basicExample() {
    try {
      System.out.println(5 / 0);
    } catch (Exception ex) {
      System.out.println("Can't divide by 0");
    }
  }

  private static void multipleCatchExample() {
    try {
      System.out.println(5 / 0);
      InputStream input = null;
      input = new FileInputStream("file.txt");  // code can throw an Exception.
    } catch (ArithmeticException ex) {
      System.out.println("Can't divide by 0");
    } catch (IOException ex) {
      System.out.println("Problem opening file");
    } catch (Exception ex) {
      System.out.println("Catch all other exceptions");
    }
  }

  private static void multiCatchExample() {
    try {
    System.out.println(5 / 0);
    InputStream input = null;
    input = new FileInputStream("file.txt");  // code can throw an Exception.
    } catch (ArithmeticException | IOException e) {
      System.out.println("Can't divide by 0 or Problem opening file");
    }
  }

  private static void propagateExample() {
    System.out.println(5 / 0);
  }

  // Resource Management With Try-Catch-Finally, Old School Style
  // http://tutorials.jenkov.com/java-exception-handling/try-with-resources.html
  private static void printFile() throws IOException {
    InputStream input = null;

    try {
      input = new FileInputStream("file.txt");  // code can throw an Exception.

      int data = input.read();
      while (data != -1) {
        System.out.print((char) data);
        data = input.read();  // code can throw an Exception.
      }
    } finally { //  always executed
      if (input != null) {
        input.close();  // code can throw an Exception.
      }
    }
  }

  private static void printFileJava7() throws IOException {

    // try-with-resources construct
    try (FileInputStream input = new FileInputStream("file.txt")) {

      int data = input.read();
      while (data != -1) {
        System.out.print((char) data);
        data = input.read();
      }
    }
  }

}
