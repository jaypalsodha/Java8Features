package predefinedfuctionalinterfaces.predicate;

/**
 *  IntPredicate is also predefined functional interface.
 *
 *  if the programme requirement is  Integer value for conditional check, then
 *
 *  instead of using Predicate, it is better choice to use IntPredicate,
 *
 *  it will increase the performance by removing autoboxing/unboxing kind of things.
 */

import java.util.function.IntPredicate;

public class IntPredicateDemo {
    public static void main(String[] args) {
        IntPredicate intPredicate = value -> value > 25;
        System.out.println(intPredicate.test(20));
    }
}
