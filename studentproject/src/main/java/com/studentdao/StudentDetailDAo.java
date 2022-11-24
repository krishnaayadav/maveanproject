package com.studentdao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.StudentDetail;
import com.util.HibernateUtil;

public class StudentDetailDAo {
	public void saveInstructorDetail(StudentDetail studentDetail) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(studentDetail);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void updateInstructorDetail(StudentDetail studentDetail) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(studentDetail);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public StudentDetail getInstructorDetail(int id) {

		Transaction transaction = null;
		StudentDetail player = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an instructor object
			player = session.get(StudentDetail.class, id);
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

	public void deleteStudentDetail(int i) {
		// TODO Auto-generated method stub

	}

}
