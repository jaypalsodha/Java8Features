import java.util.function.*;
class Movie
{
	String name;
	Movie(String name)
	{
		this.name = name;
	}
}
class ConsumerDemo1
{
	public static void main(String[] args) {
		Consumer<Movie> c1 = m-> System.out.println(m.name+" ready to release.");
		Consumer<Movie> c2 = m-> System.out.println(m.name+" release but going to be flop. . ");
		Consumer<Movie> c3 = m-> System.out.println(m.name+" Storing information in database");

		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		Movie m1 = new Movie("Spider");
		cc.accept(m1);




	}
}