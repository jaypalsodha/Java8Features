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