package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_detail")

public class StudentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// variables
	@Column(name = "id")
	private int id;

	@Column(name = "standard")
	private String standard;

	@Column(name = "address")
	private String address;

	@OneToOne(mappedBy = "studentDetail", cascade = CascadeType.ALL)
	private Student student;

	public StudentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDetail(String standard, String address) {
		super();
		this.standard = standard;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student s1) {
		this.student = s1;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", standard=" + standard + ", address=" + address + "]";
	}

}
