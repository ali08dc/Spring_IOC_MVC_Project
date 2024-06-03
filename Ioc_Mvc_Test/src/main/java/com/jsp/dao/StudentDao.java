package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Student;

@Component
public class StudentDao {

	@Autowired
	private EntityManager em;

	public boolean adminValidation(String name, String password) {

		if (name.equals("admin") && password.equals("admin")) {
			return true;
		}
		return false;
	}

	public void saveStudent(Student student) {

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
	}

	public List<Student> findAll() {
		Query q = em.createQuery("select s from Student s");
		List<Student> list = q.getResultList();

		return list;
	}

	public Object findStudentById(int id) {
		Query q = em.createQuery("select s from Student s where id=?1");
		q.setParameter(1, id);
		List<Student> list = q.getResultList();

		return list;
	}

}
