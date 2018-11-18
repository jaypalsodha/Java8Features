package lambdaExpression;

import com.sun.tools.corba.se.idl.IncludeGen;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

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

public class LambdaIntroduction{

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Child thread using lambda expression"); //lambda expression for run() method
        Thread thread = new Thread(r);
        thread.start();
        //System.out.println("Main thread execution");


        ArrayList<String> j = new ArrayList<>();
        j.add("Jaypal");
        j.add("Vishal");
        j.add("Karan");
        j.add("Mahesh");
        Comparator<String> c = Comparator.naturalOrder();
        j.sort(c);

        HashMap<String,String> s = new HashMap<>();
        s.put("asd","sdsdad");
        s.put("a","sdsdad");
        s.put("as","sdsdad");

        j.forEach(jj-> System.out.println(jj));


        Consumer<String> consumer = (s1 -> System.out.println(s1));
        consumer.accept("vishal");

        Consumer<Integer> consumer1 = (s1 -> System.out.println(s1));
        consumer1.accept(10);


        Function<String,String> function = s1 -> null;

        String p = function.apply("vishal");


    }
}



