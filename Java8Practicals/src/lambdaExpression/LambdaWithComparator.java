package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LambdaWithComparator {

    public static void main(String[] args) {

        InterfStudent createStudent = Student::new;
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(createStudent.getStudent("Jaypal",60,24,50));
        studentList.add(createStudent.getStudent("Jayesh",80,25,51));
        studentList.add(createStudent.getStudent("Tarun",70,25,40));
        studentList.add(createStudent.getStudent("Chandu",90,28,30));
        studentList.add(createStudent.getStudent("Jignesh",65,26,45));

        Comparator<Student> comparator = Comparator.comparing(Student::getName);
        Comparator.reverseOrder();
        Collections.sort(studentList, comparator);
        studentList.stream().forEach(student -> System.out.println(student.getName()));

        System.out.println();
        studentList.stream().filter(student -> student.getMarks() >60).forEach(student -> System.out.println(student.getName()));

        studentList.stream().forEach(student -> System.out.println(student.getMarks()));
    }
}