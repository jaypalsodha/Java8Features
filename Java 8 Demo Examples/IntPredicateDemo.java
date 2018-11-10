import java.util.function.*;
class IntPredicateDemo
{
	public static void main(String[] args) {
		
		IntPredicate ip = i -> i%2==0;
		System.out.println(ip.test(10));
		System.out.println(ip.test(5));
	}
}