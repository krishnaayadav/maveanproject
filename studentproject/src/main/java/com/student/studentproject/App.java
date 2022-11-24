package com.student.studentproject;

import com.entity.Student;
import com.entity.StudentDetail;
import com.studentdao.StudentDao;
import com.studentdao.StudentDetailDAo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// Save two instructors
		Student student = new Student("krishna", "yadav", 12);
		StudentDetail studentDetail = new StudentDetail("12th", "mumbai");
		student.setStudentFirstName("kundan");
		studentDetail.setStudent(student);
		student.setStudentDetail(studentDetail);

		Student student1 = new Student("hemant", "kumar", 32);
		StudentDetail studentDetail1 = new StudentDetail("11th", "nashik");
		student1.setStudentFirstName("kushal");
		studentDetail1.setStudent(student1);
		student1.setStudentDetail(studentDetail1);

		StudentDao studentdao = new StudentDao();
		// for save data
		// student.saveStudent(student);
		// student.saveStudent(student);
		StudentDetail s1 = student.getStudentDetail();

		System.out.println(s1.getStudent());
		s1.setStudent("kunal");
		student.deleteStudent(4);

		StudentDetailDAo stud = new StudentDetailDAo();

		stud.deleteStudentDetail(4);

	}
}
