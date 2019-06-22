# Java8Features


# Lambda Expression
defination 
- It is an anonymous function. 
	- nameless
	- without return type
	- without modifier

	benefits:- It is used to enable functional programming.

	let see how to write lambda expression:-

	suppose we have an method

	public void doSomething()
	{
		System.out.println("hello");
	}

	As per the defination lambda expression doesn't contains name, return type and modifier. 

	so just remove all these things from above method. 

	()
	{
		System.out.println("hello");	
	}

	to represent lambda expression they provide one special symbol called -> (arrow) is used.

	() ->
	{
		System.out.println("hello");	
	}

	here, curly braces is the body of an method.

	() ->{System.out.println("hello");}

	If method body contains only one line of code, then {} becomes optional.


	example 2:- 
	using java 7 :- 
	public void m1(int a, int b)
	{
		System.out.println(a+b);
	}

	using lambda expression. 

	(a,b)-> System.out.println(a+b);

	example 3:- 
	
	using java 7 
	public int squareIt(int n)
	{
		return n*n;
	}
	using lambda expression

	(int n)-> {return n*n;}
	Or
	(int n)-> n*n; //without brackets you don't need to specify return keyword 
	Or
	(n) -> n*n; // if only one argument is there,then paranthesis is also not needed
	or
	n -> n*n; // if body contain only one line the curly braces are not needed.



	public void m1(String s)
	{
		return s.length();
	}

	using lambda expression

	s -> s.length();

	without curly braces we cannot use return statement
	within curly braces if we want to return some value then we must have to use return statement. 


	Once we write lambda expressions.

	Functional Interface

		- Functional interface is an interface which contains single abstract method(SAM).


	
	Functional Interface with respect to Inheritance

	-----------------------------------------------------------------------------------
	@FunctionalInterface
	interface A
	{
		public void m1();

	}
	@FunctionalInterface	
	interface B extends A
	{

	}

	above example is perfectly valid. . 

	----------------------------------------------------------------------------------
	@FunctionalInterface
	interface A
	{
		public void m1();

	}
	@FunctionalInterface	
	interface B extends A
	{
		public void m1(); /// overriding concept is there, so its valid
	}

	--------------------------------------------------------------------------------
	@FunctionalInterface
	interface A
	{
		public void m1();

	}
	@FunctionalInterface	
	interface B extends A
	{
		public void m2(); /// Child interface contains two abstract methods
	}

	--------------------------------------------------------------------------------
	@FunctionalInterface
	interface A
	{
		public void m1();

	}
	//@FunctionalInterface	 removed annotation, so it is valid
	interface B extends A
	{
		public void m2(); /// valid because its normal interface
	}	

	---------------------------------------------------------------------------------



	Lambda expression for Multi Threading

	Lambda expression with Collections class

	Use Lambda expression for our own class.

	Anonymous inner class is more power full than lambda expression. 


	as lambda expression can only be used with only functional interface. 

	but anonymous inner class can be used for both the cases.


Default Methods:- 
	- 1.8 version onwards we can take default methods inside interface. 
	- untill 1.7v every method present inside interface always ::: public and abstract.
	- in 1.8 version default methods and static method allowed.
	- in 1.9 version private methods are also allowed.
	- every variable present inside interface is always public static final. 

Default Method | Virtual Extension Method | Defender Method :-
	- without affecting implementation classes. 
	- without affecting implementation classes if we want to add new method to the interface, we can use default method. 


	Example for default method:::::


		interface Left
		{
			default void m1(){
				System.out.println("Left Interface Method");
			}
		}
		interface Right
		{
			default void m1(){
				System.out.println("Right interface Method");
			}	
		}

		class Test implements Left, Right
		{
			public void m1()
			{
				System.out.println("implementing method m1");
			}
			public static void main(String[] args) {
				Test t = new Test();
				t.m1();
			}
		}

		here if we remove method m1() from the implementing class(i.e Test Class) then code
		won't compile, because there are same default methods in Left and Right method, so
		which method to call.


Main purpose of Default method inside interface:- 
	- without affecting implementation classes, If we want to add new method to the interface.


To define general utility method inside interface with static method.

static methods are not directly available to the imlementation classes. 

we have to call that method using interface Name. 	
	


Predefined Functional Interfaces:- 
---------------------------------------------------------------------------------------------
 - Predicate
 - Function
 - Consumer
 - Supplier


Two argument predefined Functional Interfaces:- 
---------------------------------------------------------------------------------------------
 - BiPredicate
 - BiFunction
 - BiConsumer

primitive Functional Interfaces:- 
---------------------------------------------------------------------------------------------
 - IntPredicate
 - IntFunction
 - IntConsumer  


Predicate(I):- functional interface
 - Predicate functional interface is mainly use to check conditional checks.
 - single parameter is allowed for predicate function.
 - Type of parameter can be any datatype like Integer, float, double, or any object type.
 - we use lambda expression to write our condtion inside the predicate.
 - example
 	interface Predicate<T>
 	{
 		public abstract boolean test(T t);
 	}

 - to check the boolean condition then we can go for Predicate function.

 	Example for Predicate use:- 

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

Predicate joining:- 
 - we can join two predicate condition together using "and" and "or" method present in predicate functional interface.
 - we can also use negate() method to get the reverse result of predicate condition.		


Function (Predefined Functional interaface):- 
 
 example:- 

 interface Function<T,R>
 {
 	public abstract R apply(T t);
 }

	import java.util.function.*;
	class FunctionDemo
	{
		public static void main(String[] args) {
			
			Function<String,String> f = s->s.toUpperCase();
			System.out.println(f.apply("jaypal"));
		}	
	}


---------------------------------------------------------------------------------------
import java.util.function.*;

class Student
{
	String name;
	int marks;
	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
}
class FunctionDemo
{
	public static void main(String[] args) {
		
		Student[] s = new Student[5];
		s[0] = new Student("rajesh",96);
		s[1] = new Student("hitesh",10);
		s[2] = new Student("rajes",50);
		s[3] = new Student("rajes",66);
		s[4] = new Student("rajes",76);

		Function<Student,String> fun = student->
		{
			int marks = student.marks;
			String grade = "";
			if(marks > 80) grade = "A[Distinction]";
			else if(marks > 60) grade = "B[First Class]";
			else if(marks > 50) grade = "C[Second Class]";
			else if(marks > 35) grade = "D[Third Class]";
			else grade = "E[Failed]";
			return grade;
		};

		for(Student s1 : s){
			System.out.println("Student name :"+ s1.name);
			System.out.println("Student marks :"+ s1.marks);
			System.out.println("Student grade :"+ fun.apply(s1));
			System.out.println();
		}
	}	
}
--------------------------------------------------------------------------------------


function chaining:- 

f1.andThen(f2).apply(i);

first f1 and then f2 will be applied

--------------------------------------------------------------------------------------

import java.util.function.*;

class FunctionDemo
{
	public static void main(String[] args) {
		
		Function<Integer,Integer> f1 = i-> 2*i;
		Function<Integer,Integer> f2 = i-> i*i*i;

		System.out.println(f1.andThen(f2).apply(2));  //64
		System.out.println(f1.compose(f2).apply(2));  //16
	
	}
}
---------------------------------------------------------------------------------------





Consumer:- 
--------------------------------------------------------------------------------------

Predicate<T>  -----------for boolean
Function<T,R> ----------- return value 
Consumer<T>.  ------------ void


interface Consumer<T>
{
	public abstract void accept(T t);
}

--------------------------------------------------------------------------------------

import java.util.function.*;

class Student
{
	String name;
	int marks;
	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
}
class ConsumerDemo
{
	public static void main(String[] args) {
		
		Student[] s = new Student[5];
		s[0] = new Student("rajesh",96);
		s[1] = new Student("hitesh",10);
		s[2] = new Student("rajes",50);
		s[3] = new Student("rajes",66);
		s[4] = new Student("rajes",76);

		Function<Student,String> fun = student->
		{
			int marks = student.marks;
			String grade = "";
			if(marks > 80) grade = "A[Distinction]";
			else if(marks > 60) grade = "B[First Class]";
			else if(marks > 50) grade = "C[Second Class]";
			else if(marks > 35) grade = "D[Third Class]";
			else grade = "E[Failed]";
			return grade;
		};
		Predicate<Student> p = s2->s2.marks > 60;
		Consumer<Student> c = s1->{
			System.out.println("Student name :"+ s1.name);
				System.out.println("Student marks :"+ s1.marks);
				System.out.println("Student grade :"+ fun.apply(s1));
				System.out.println();
		};

		for(Student s1 : s){

			if(p.test(s1)){
				c.accept(s1);
			}	
		}
	}	
}
-----------------------------------------------------------------------------------------

Chaining for consumer:- 

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

----------------------------------------------------------------------------------------




Supplier:- 
-----------------------------------------------------------------------------------------
 - never take any input parameter.
 - return the supplied type of supplier.
 

	import java.util.function.Supplier;
	import java.util.Date;
	class SupplierDemo
	{
		public static void main(String[] args) {
			
			Supplier<String> s = () -> {
				String otp ="";
				for (int i=0;i<6;i++ ) {
					otp = otp + (int)(Math.random()*10);
				}
				return otp;
			};

			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());

		}
	}



Predicate ----------> test()
Function  ----------> apply()
Consumer  ----------> accept()
Supplier  ----------> get()


- Normal predicate can take only one argument and perform conditional check, 
- but sometimes our programme requirement is, we have to take two input arguments 
  and perform soe condtional check, for this requirement, we should go for BiPredicate 
  function.

- BiPredicate is exatly same as predicate except that it takes two arguments.

interface BiPredicate<T1,T2>
{
	public abstract boolean test(T1 t1, T2 t2)
	//remaining methods are same as Predicate only
}
- to check the sum of two given integer is even or not by using BiPrediate

	import java.util.function.BiPredicate;
	class BiPredicateDemo // if two arguments are there and if we want for condition check then
	{
		public static void main(String[] args) {
			
			BiPredicate<Integer,Integer> bi = (a,b)->(a+b)%2 ==0;
			System.out.println(bi.test(10,20));
			System.out.println(bi.test(1,2));
		}
	}
---------------------------------------------------------------------------------------
**************
*BiFunction:-*
**************

inteface BiFunction<T,U,R>
{
	public abstract R apply(T,U,R);
	//default method andThen() is also available
}


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

------------------------------------------------------------------------------------------

**************
* BiConsumer *
**************

 - If we arguments are there for consumer, we can use BiConsumer predefined Functional 
   interface

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
---------------------------------------------------------------------------------------


Predicate
Function
Consumer

above three functional interface can take only one input argument

BiPredicate
BiFunction
BiConsumer

above three functional interface can take two input argument. 



- If we use predicate for primitive integers, then every time for conditional checks
  autoboxing and autoboxing will be happen, then it will impact the performance. 



Primitive predicate type list:- 
	1. IntPredicate              // take primitive int
	2. DoublePredicate.          // 
	3. LongPredicate

for two argument predicate we don't have any primitive version for that

primitive Function type list:- 
	1. DoubleFunction //can take input type as double, return can be anything
	2. IntFunction.  // can take input type as int, return can be type
	3. LongFuncton   // can take input type as long, return can be any type

	4. DoubleToIntFunction // input type is double, return type is Int type
	5. DoubleToLongFunction // input type is double, return type is Long
	6. IntToDoubleFunction  // input type is Int, return type is double
	7. IntToLongFunction // input type is int, return type is long
	8. LongIntFunction // input typle is Long, return type is int
	9. LongDoubleFunction // input type is long, return type is double

	10. ToIntFunction // input type can be anything, return type is Int
	11. ToDoubleFunction /// input can be anything, return type is double
	12. ToLongFunction // input type can be anything , return type is Long


	13. ToIntBiFunction  // two input arguments, but return type is Int type
	14. ToLongBiFunction. // two input can be anything, return type is Long
	15. ToDoubleBiFunction // two input can be anything, return type is double

	---------------------------------------------------------------------------------
		import java.util.function.*;
		class IntFunctionDemo
		{
			public static void main(String[] args) {
				
				IntFunction<Integer> f = i -> i*i;
				System.out.println(f.apply(4));
			}
		}
    ---------------------------------------------------------------------------------
		import java.util.function.*;
		class IntFunctionDemo
		{
			public static void main(String[] args) {
				
				ToIntFunction<String> f = s -> s.length();
				System.out.println(f.applyAsInt("jaypal"));
			}
		}
    ---------------------------------------------------------------------------------
		import java.util.function.*;
		class IntFunctionDemo
		{
			public static void main(String[] args) {
				
				IntToDoubleFunction i = j-> Math.sqrt(j);
				System.out.println(i.applyAsDouble(7));
			}
		}	
	---------------------------------------------------------------------------------
	

	
primitive type for  Consumer Functional Interface:- 
	1. IntConsumer   //accept int input parameter
	2. DoubleConsumer // accept double input parameter
	3. LongConsumer.   // accept 


	4. ObjDoubleConsumer
		- void accept(T t, double d)
	5. ObjIntConsumer
	6. ObjLongConsumer


primitive type for Supplier Functional interface:- 
	1. BooleanSupplier. //getAsBoolean()
	2. IntSupplier.     // getAsInt()
	3. LongSupplier.    // getAsLong()
	4. DoubleSupplier.  // getAsDouble()

---------------------------------------------------------------------------------------

UnaryOperator:- 
 - If input type and output type both are same, then we should go for UnaryOperator. 
 - It is a child interface of Function interface.


import java.util.function.*;
class UnaryOperatorDemo
{
	public static void main(String[] args) {
		
		UnaryOperator<Integer> u = i->i*i;
		System.out.println(u.apply(6));
	}
}


primitive type of UnaryOperator:- 
	1. IntUnaryOperator.      //applyAsInt()
	2. LongUnaryOperator	  //applyAsLong()	
	3. DoubleUnaryOperator    //applyAsDouble()


	----------------------------------------------------------------
	import java.util.function.*;
	class UnaryOperatorDemo
	{
		public static void main(String[] args) {
			
			IntUnaryOperator u = i->i*i;
			System.out.println(u.applyAsInt(6));
		}
	}
	-----------------------------------------------------------------



BinaryOperator

	- instead of BiFunction we can use BinaryOperator, if two argument and return type is same



	import java.util.function.*;

	class BinaryOperatorDemo
	{
		public static void main(String[] args) {
			BiFunction<String,String,String> ss = (s1,s2)-> s1+s2;
			System.out.println(ss.apply("java.util.","jaypal"));		
		}
	}

	import java.util.function.*;

	class BinaryOperatorDemo
	{
		public static void main(String[] args) {
			BinaryOperator<String> ss = (s1,s2)-> s1+s2;
			System.out.println(ss.apply("java.util.","jaypal"));		
		}
	}


primitive type for BinaryOperator functional interface are:- 
	1. IntBinaryOperator
	2. LongBinaryOperator
	3. DoubleBinaryOperator



Predefined Functional Interfaces:-
-------------------------------------------------
	1. Predicate
	2. Function
	3. Consumer
	4. Supplier
------------------------------------------------
Two argument functional interfaces
	1. BiPredicate
	2. BiFunction
	3. BiConsumer
------------------------------------------------
Primitive type are also discussed.
	1. IntPredicate
	2. IntFunction
	3. IntConsumer
------------------------------------------------



Method and Constructor Reference:- 

Method Referance:- 
- main use of method referance is for code reusability	

	Example:- 
	syntax for static method
	- ClassName :: method name

	class MethodReferanceDemo

	{
		public static void m1()
		{
			for (int i =0;i<10 ;i++ ) {
					System.out.println("Child Thread");
				}
		}
		public static void main(String[] args) {
			
			Runnable r = MethodReferanceDemo :: m1;
			Thread t = new Thread(r);
			t.start();
			for (int i =0;i<10 ;i++ ) {
					System.out.println("Main Thread");
				}
		}
	}


syntax for instance method
	- Object reference :: method name

	Example :- 

	class MethodReferanceDemo

	{
		public void m1()
		{
			for (int i =0;i<10 ;i++ ) {
					System.out.println("Child Thread");
				}
		}
		public static void main(String[] args) {
			
			MethodReferanceDemo mr = new MethodReferanceDemo();
			Runnable r = mr :: m1;
			Thread t = new Thread(r);
			t.start();
			for (int i =0;i<10 ;i++ ) {
					System.out.println("Main Thread");
				}
		}
	}


	---------------------------------------------------------------------------------


		class MethodReferanceDemo

		{
			public int m1()
			{
				for (int i =0;i<10 ;i++ ) {
						System.out.println("Child Thread");
					}
					return -1;
			}
			public static void main(String[] args) {
				
				MethodReferanceDemo mr = new MethodReferanceDemo();
				Runnable r = mr :: m1;
				Thread t = new Thread(r);
				t.start();
				for (int i =0;i<10 ;i++ ) {
						System.out.println("Main Thread");
					}
			}
		}
	In the case of method reference different return types are allowed, even modifier can
	be different, we can take an example of run method of runnable interface. 

	But argument type must be same.


		class MethodReferanceDemo

		{
			public int m1(int x)
			{
				for (int i =0;i<10 ;i++ ) {
						System.out.println("Child Thread");
					}
					return -1;
			}
			public static void main(String[] args) {
				
				MethodReferanceDemo mr = new MethodReferanceDemo();
				Runnable r = mr :: m1;
				Thread t = new Thread(r);
				t.start();
				for (int i =0;i<10 ;i++ ) {
						System.out.println("Main Thread");
					}
			}
		}


		MethodReferanceDemo.java:15: error: incompatible types: invalid method reference
				Runnable r = mr :: m1;
				             ^
		    method m1 in class MethodReferanceDemo cannot be applied to given types
		      required: int
		      found: no arguments
		      reason: actual and formal argument lists differ in length
		1 error

	-------------------------------------------------------------------------------------	

	another example for method reference. . 

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


	If implementation for corrosponding abstract method is already available at that time
	we can go for method reference to reuse the same method. 
	It will increase the code reusability. 

	but if the implementation is not available then we can got for lambda expression. 




	Constructor Reference:- ----- 


	example :- without any argument for constructor


		class Sample
		{
			Sample(){
				System.out.println("Sample class constructor implementation . . ");
			}
		}
		interface I{
			public Sample get();
		}
		class ConstructorReferenceDemo
		{
			public static void main(String[] args) {
				I i = Sample :: new;
				Sample s = i.get();
			}
		}		
	--------------------------------------------------------------------------------
	
	Example :- Constructor reference with agrument list


		class Sample
		{
			Sample(String s){
				System.out.println("Sample class constructor implementation . . "+ s);
			}
		}
		interface I{
			public Sample get(String s);
		}
		class ConstructorReferenceDemo
		{
			public static void main(String[] args) {
				I i = Sample :: new;
				Sample s = i.get("1");
				Sample s1 = i.get("2");
				Sample s2 = i.get("3");
				Sample s3 = i.get("4");
			}
		}
	--------------------------------------------------------------------------------
	

		class Sample
		{
			Sample(String s){
				System.out.println("Sample class constructor implementation . . "+ s);
			}

			Sample(){
				System.out.println("No argument constructor implementation . . ");
			}
		}
		interface I{
			public Sample get(String s);
		}
		class ConstructorReferenceDemo
		{
			public static void main(String[] args) {
				I i = Sample :: new;
				Sample s = i.get("1");
				Sample s1 = i.get("2");
				Sample s2 = i.get("3");
				Sample s3 = i.get("4");
			}
		}	
	--------------------------------------------------------------------------------
	

		class Student
		{
			String name;
			int age;

			Student(String name, int age);
			{
				this.name = name;
				this.age = age;
			}

		}

		interface I{
			public Student get(String name, int age);
		}
		class ConstructorReferenceDemo
		{
			public static void main(String[] args) {
				I i = Student :: new;
				Student s1 = i.get("jaypal",24);
			}
		}

	--------------------------------------------------------------------------------		

