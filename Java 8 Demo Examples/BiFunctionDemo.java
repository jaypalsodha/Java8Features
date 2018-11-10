import java.util.function.BiFunction;
import java.util.ArrayList;
class Employee
{
	int eno;
	String name;
	Employee(int eno, String name)
	{
		this.eno = eno;
		this.name = name;
	}
}
class BiFuctionDemo
{
	public static void main(String[] args) {
		
		BiFunction<Integer,String,Employee> bf = 
		(eno,name)-> new Employee(eno,name);

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(bf.apply(100,"jaypal"));
		l.add(bf.apply(200,"ravi"));
		l.add(bf.apply(300,"Shiva"));
		for (Employee e  : l) {
			System.out.println("Employee number "+ e.eno);
			System.out.println("Employee name "+ e.name);
			System.out.println();
		}
	}
}