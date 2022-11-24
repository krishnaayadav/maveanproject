package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = " studentinfo ")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id") // it will be disply in database table
	private int id;

	@Column(name = "student_First_Name")
	private String studentFirstName;

	@Column(name = "student_Last_Name")
	private String studentLastName;

	@Column(name = "student_age")
	private int studentage;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_detail_id")
	private StudentDetail studentDetail;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentFirstName, String studentLastName, int studentage) {
		super();

		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentage = studentage;

	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName
				+ ", studentage=" + studentage + ", studentDetail=" + studentDetail + "]";
	}

	public void deleteStudent(int i) {
		// TODO Auto-generated method stub

	}

}
