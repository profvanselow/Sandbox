# Potential Interview Topics
## Abstract Class
* Cannot be instantiated.
* Can be a subclass.
  - If it does not provide implementations for all of the abstract methods, then the subclass must
  also be declared abstract.
* Can declare fields that are not static and final, and define public, protected, and private 
  concrete methods.
* Abstract classes are similar to interfaces.
  - Cannot be instantiated
  - May contain a mix of methods declared with or without an implementation.
## Final Keyword
* Final references must always reference the same object.
* The object to which the variable is referencing cannot be changed.
* The contents of that object may be modified.
* Makes it a constant.
* ALL CAPS.
## Inner classes
* See nested class.
* Event handling mechanisms uses them.
## Static Inner Class
* Used if access to an enclosing instance's non-public fields and methods is not required.
## Local Class
* Local classes are classes that are defined in a block, which is a group of zero or more statements
 between balanced braces.
* Typically defined in the body of a method.
## Nested Class
* The Java programming language allows you to define a class within another class.
* Static and non-static. 
  - Static: Nested classes that are declared static. 
	- Inner class: Non-static nested classes.
* Inner classes have access to other members of the enclosing class, even if they are declared private. 
* Static nested classes do not have access to other members of the enclosing class. 
* As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. 
  - Recall that outer classes can only be declared public or package private.
* Why use them:
  - It is a way of logically grouping classes that are only used in one place.
  - It increases encapsulation.
  - It can lead to more readable and maintainable code.
## Anonymous Inner Class
* It is an inner class without a name and for which only a single object is created. 
* An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overloading methods of a class or interface, without having to actually subclass a class.
* Anonymous inner classes are useful in writing implementation classes for listener interfaces in graphics programming.
* Anonymous inner class are mainly created in two ways:
  - Class (may be abstract or concrete)
  - Interface
## Generic Classes
* What does the following code fragment print?
```java
  List <String> l1 = new ArrayList<String>();
  List<Integer> l2 = new ArrayList<Integer>();
  System.out.println(l1.getClass() == l2.getClass());
```
- You might be tempted to say false, but you'd be wrong. It prints true, because all instances of a generic class have the same run-time class, regardless of their actual type parameters.
