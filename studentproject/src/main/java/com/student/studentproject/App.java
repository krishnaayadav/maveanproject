package com.student.studentproject;

import java.util.List;

import com.entity.Student;
import com.entity.StudentDetail;
import com.studentdao.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// adding student and student details
		Student s1 = new Student("krishna", "yadav", 18);
		StudentDetail sd1 = new StudentDetail("12th", "mumbai");
		s1.setStudentDetail(sd1);
		sd1.setStudent(s1);

		Student s2 = new Student("kundan", "yadav", 16);
		StudentDetail sd2 = new StudentDetail("10th", "nashik");
		s2.setStudentDetail(sd2);
		sd2.setStudent(s2);

		StudentDao sd = new StudentDao();
		sd.saveStudent(s1);
		sd.saveStudent(s2);

		// delet student
		sd.deleteStudent(1);

		// update student
		// s2.setStudentFirstName("kushal");
		// sd.updateStudent(s2);

		// get student by id
		// System.out.println("student name is :" + sd.getInstructor(1));

		// getting all student
		List<Student> allStudent = sd.getAllStudent();

		// printing all student first type
		allStudent.forEach(s -> System.out.println(s.getStudentFirstName()));
	}
}
