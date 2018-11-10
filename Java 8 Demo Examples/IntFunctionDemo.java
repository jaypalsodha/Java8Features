import java.util.function.*;
class IntFunctionDemo
{
	public static void main(String[] args) {
		
		IntToDoubleFunction i = j-> Math.sqrt(j);
		System.out.println(i.applyAsDouble(7));
	}
}