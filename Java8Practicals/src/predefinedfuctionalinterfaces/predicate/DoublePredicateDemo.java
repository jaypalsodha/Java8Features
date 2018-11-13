package predefinedfuctionalinterfaces.predicate;

import java.util.function.DoublePredicate;

/**
 *  DoublePredicate is also predefined functional interface.
 *
 *  Conditional check is on double value, then for better performance we should use
 *
 *  DoublePredicate functional interface instead of using Only Predicate.
 */
public class DoublePredicateDemo {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = value -> value == 10; //simple replacement of if condition
        System.out.println(doublePredicate.test(10.0));
    }
}
