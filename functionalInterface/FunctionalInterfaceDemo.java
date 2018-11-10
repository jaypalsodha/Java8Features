package functionalInterface;

/**
 * - Functional interface is a new feature in java 8.

 * - If interface contains single abstract method(SAM) then that interface is called as functional interface.
 *
 * - We can define interface as a functional interface by using @FunctionalInterface Annotation.
 *
 * - Interface defined with @FunctionalInterface must contains only one abstract method. otherwise compiler will
 *   generate error saying not abstract method present in the functional interface.
 *
 * - Functional interface can contains any number of default and static methods(as from java 8, default and static
 *   methods are allowed for interface).
 *
 *   Runnable (run() method), Comparable(compareTo() method), Comparator(compare() method)
 *   are some examples of Functional Interfaces.
 *
 *   Before java 8, to use the interface method, we used to created implementation class and providing the
 *   implementation for that particular method like
 *
 *   class A implements I
 *   {
 *       public void m1()
 *       {
 *           System.out.print("implementation for abstract method");
 *       }
 *   }
 *   we can overcome this implementation class using functional interface and lambda expressions.
 */

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        FunInterface funInterface = (a, b) -> a+b;
        funInterface.sum(10,20);
    }
}

