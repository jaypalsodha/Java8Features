interface I
{
	public abstract void add(int a, int b);
}

class MethodReferanceDemo1
{
	public static void sum(int x,int y){
			System.out.println("sum is:- "+ (x+y));
	}
	public static void main(String[] args) {
		
		I i = (a,b)->System.out.println("sum of a and b is:- "+ (a+b));
		i.add(10,20);

		I i1 = MethodReferanceDemo1 :: sum;
		i.add(100,200);
	}
}