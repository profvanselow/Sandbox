package sandbox;

class NestedClass {

  private int outerClassField;

  public int getOuterClassField() {
    return outerClassField;
  }

  class InnerClass {  // non-static nested class

    void changeOuterClassField() {

      // can't do this if static
      outerClassField = 5;
    }
  }
   static class StaticNestedClass {

      void changeOuterClassField() {

        // can't do this in static
        //outerClassField = 5;
      }

  }
}
