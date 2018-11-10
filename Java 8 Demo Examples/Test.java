import java.util.function.Predicate;
class Test
{
	public static void main(String[] args) {
		
		//using p
		Predicate<Integer> p = i ->i%2==0;
		System.out.println(p.test(10));
		
		System.out.println();

		Predicate<String> p1 = s ->s.equals("jaypal") || s.equals("sodha");
		System.out.println(p1.test("jaypal"));
		System.out.println(p1.test("sodha"));

		Employee emp = new Employee("karan",24);
		Predicate<Employee> empPredicate = namePara -> namePara.name.equals("jaypal sodha");

		Predicate<Employee> agePredicate = agePara -> agePara.age.equals(24);
		System.out.println(empPredicate.test(emp));
		System.out.println(agePredicate.test(emp));

	}
}

class Employee
{
	String name;
	Integer age;

	Employee(String name, Integer age){
		this.name = name;
		this.age = age;
	}
}

