package predefinedfuctionalinterfaces.predicate;

import java.util.function.Predicate;

/**
 *  Predicate is a predefined functional interface.
 *
 *  Added in java 1.8 version.
 *
 *  Predicate can be used for conditional checks.
 *
 *  If-Else statements can be replaced with Predicate.
 *
 *  Predicate takes single input parameter and always returns boolean value (true/false).
 *
 *  test() method of Predicate interface is used to check condition.
 *
 *  Predicate interface also contains three other methods.
 *      1. and()    // if both the predicate conditions are true.
 *      2. or()     // if any one of predicate conditions is true.
 *      3. negate() // for a negation of particular condition.
 *
 *  Predicate interface is only used for wrapper classes.
 *
 *  due to wrapper classes, on every condition checks, autoboxing/unboxing is happens, due to which
 *  performance degrades, to overcome this issue, there are some primitive Predicate also available.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = age -> age >24;
        System.out.println("He is young man "+integerPredicate.test(23));
    }
}
