import java.util.function.*;
class ConsumerDemo
{
	public static void main(String[] args) {
		
		Consumer<String> c = s-> System.out.println(s);
		c.accept("jaypal sodha");
	}
}