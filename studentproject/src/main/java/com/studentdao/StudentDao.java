package com.studentdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Student;
import com.util.HibernateUtil;

public class StudentDao {
	/**
	 * Save Instructor
	 * 
	 * @param instructor
	 */
	public void saveStudent(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(student);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Update Instructor
	 * 
	 * @param instructor
	 */
	public void updateStudent(Student student) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(student);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Delete Instructor
	 * 
	 * @param id
	 */
	public void deleteStudent(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a instructor object
			Student student = session.get(Student.class, id);
			if (student != null) {
				session.delete(student);
				System.out.println("instructor is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	/**
	 * Get Instructor By ID
	 * 
	 * @param id
	 * @return
	 */
	public Student getInstructor(int id) {

		Transaction transaction = null;
		Student player = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object
			player = session.get(Student.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return player;
	}

	/**
	 * Get all Instructors
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {

		Transaction transaction = null;
		List<Student> listOfStudent = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object

			listOfStudent = session.createQuery("from Instructor").getResultList();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfStudent;
	}

}
