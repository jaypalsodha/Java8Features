import java.util.function.BiPredicate;
class BiPredicateDemo // if two arguments are there and if we want for condition check then
{
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bi = (a,b)->(a+b)%2 ==0;
		System.out.println(bi.test(10,20));
		System.out.println(bi.test(1,2));
	}
}
