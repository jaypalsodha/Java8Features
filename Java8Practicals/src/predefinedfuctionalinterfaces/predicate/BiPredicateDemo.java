package predefinedfuctionalinterfaces.predicate;

import java.util.function.BiPredicate;

/*
 *  what if we have two input parameters to check condition.
 *
 *  BiPredicate is used for two input parameters.
 *
 *  interface BiPredicate<T,U>
 *      {
 *          public abstract boolean test(T t, U u);
 *      }
 *
 */
public class BiPredicateDemo {
    public static void main(String[] args) {

        BiPredicate<Integer,String> biPredicate = (age,name)-> age >20 && name.length() >3;
        System.out.println("young boy  . . "+biPredicate.test(20,"jaypal"));

    }
}
