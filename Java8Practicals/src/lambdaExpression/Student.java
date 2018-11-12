package lambdaExpression;

class Student
{
    private String name;
    private int marks;
    private int age;
    private int rollNo;

    public Student(String name, int marks, int age, int rollNo) {
        this.name = name;
        this.marks = marks;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }
}
