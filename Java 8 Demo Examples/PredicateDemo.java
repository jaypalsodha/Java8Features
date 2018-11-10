import java.util.function.*;
class PredicateDemo
{
	public static void main(String[] args) {

		int[] x = {0,5,10,15,20,25,30,35};
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer>p2 = i-> i>10;

		System.out.println("The numbers which are even and greater than 10 are");
		for(int xx : x){
			if(p1.and(p2).test(xx)){
				System.out.println(xx);
			}
		}
		System.out.println();
		System.out.println("The numbers which are even or greater than 10 are");
		for(int xx : x){
			if(p1.or(p2).test(xx)){
				System.out.println(xx);
			}
		}

		System.out.println();
		System.out.println("The numbers which are even are");
		for(int xx : x){
			if(p1.test(xx)){
				System.out.println(xx);
			}
		}

		System.out.println();
		System.out.println("The numbers which are not even are");
		for(int xx : x){
			if(p1.negate().test(xx)){
				System.out.println(xx);
			}
		}
	}

}