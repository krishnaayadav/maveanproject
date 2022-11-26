package com.student.studentproject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.entity.Student;
import com.studentdao.StudentDao;

public class StudentTestApp {
	StudentDao students;

	@Before
	public void setup() throws Exception {
		students = new StudentDao();
	}

	@After
	public void teardown() throws Exception {
		students = null;
	}

	@Test
	public void testDeletStudent() {
		// storing the deleted student detail
		Student delets = students.deleteStudent(1);

		// student check if deleted or not
		assertEquals(null, delets);
	}

}
