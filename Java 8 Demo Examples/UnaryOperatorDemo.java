import java.util.function.*;
class UnaryOperatorDemo
{
	public static void main(String[] args) {
		
		IntUnaryOperator u = i->i*i;
		System.out.println(u.applyAsInt(6));
	}
}