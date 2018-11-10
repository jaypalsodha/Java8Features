import java.util.function.*;

class BinaryOperatorDemo
{
	public static void main(String[] args) {
		BinaryOperator<String> ss = (s1,s2)-> s1+s2;
		System.out.println(ss.apply("java.util.","jaypal"));		


		IntBinaryOperator ss1 = (s1,s2)-> s1+s2;
		System.out.println(ss1.applyAsInt(10,20));		
	}
}