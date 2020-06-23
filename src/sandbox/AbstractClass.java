// This is oyur project!!!!!

package sandbox;

// Declared abstract, cannot be instantiated but can be subclassed.
// When an abstract class is subclassed,the subclass usually provides implementations for all of the abstract methods
// in its parent class.However,if it does not,then the subclass must also be declared abstract.
public abstract class AbstractClass {

    // Abstract classes can have fields that are not static and final, unlike interfaces.
    int count;

    // Abstract class may or may not include abstract methods.
    // An abstract method is a method that is declared without an implementation.
    // If a class includes abstract methods, then the class itself must be declared abstract.
    abstract void moveTo(double deltaX, double deltaY);

    // Concrete methods have complete definitions
    public void printAbstractInfo() {
        System.out.println("You can declare fields that are not static and final, and define public, protected, and " +
                "private concrete methods.");
        // https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
    }

}
