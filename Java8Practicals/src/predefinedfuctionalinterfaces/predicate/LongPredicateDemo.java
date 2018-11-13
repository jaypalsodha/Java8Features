package predefinedfuctionalinterfaces.predicate;

import java.util.function.LongPredicate;

/**
 *  LongPredicate is also predefined functional interface.
 *
 *  It is mainly use for primitive long value to avoid autoboxing and unboxing.
 *
 *  Any Predicate interface will always returns boolean value.
 */
public class LongPredicateDemo {
    public static void main(String[] args) {
        LongPredicate longPredicate = value -> value > 0;
        System.out.println(longPredicate.test(3));
    }
}
