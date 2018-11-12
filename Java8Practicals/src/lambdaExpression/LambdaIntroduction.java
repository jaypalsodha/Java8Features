package lambdaExpression;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 *  - Lambda expression is defined as anonymous function.
 *
 *  - Lambda expression doesn't contains
 *      1. method name
 *      2. return type
 *      3. modifier
 *
 *  - Lambda expression can be represented using -> (arrow) sign.
 *
 *  - Lambda expression can only be applicable for functional interface.
 *
 *  - Normal method to lambda expression conversion.
 *
 *     public int sum(int a, int b)
 *     {
 *         return a + b;
 *     }
 *
 *     Let's remove method name, return type, modifier and add lambda expression sign.
 *
 *     (int a, int b) -> { return a+b; }  this is lambda expression for above method.
 */

public class LambdaIntroduction {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Child thread using lambda expression"); //lambda expression for run() method
        Thread thread = new Thread(r);
        thread.start();
        System.out.println("Main thread execution");
    }
}
