import java.util.ArrayList;
import java.util.function.BiConsumer;
class Employee
{
	String name;
	double salary;
	Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
}
class BiConsumerDemo
{
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		BiConsumer<Employee,Double> bc = (e,d)->e.salary = e.salary +d;
		for (Employee e : l) {
			bc.accept(e,500.0);
		}

		for (Employee e : l) {
			System.out.println("Emp name :- "+ e.name);
			System.out.println("Emp salary :- "+ e.salary);
			System.out.println( );
		}

	}
	public static void populate(ArrayList<Employee> l){
		l.add(new Employee("hihi",1000));
		l.add(new Employee("jaypal",2000));
		l.add(new Employee("dhiren",3000));
	}
}