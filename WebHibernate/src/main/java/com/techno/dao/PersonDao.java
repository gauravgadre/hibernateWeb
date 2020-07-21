package com.techno.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.techno.entites.Person;
import com.techno.utill.HibernateUtill;

public class PersonDao {

	public static void savePerson(Person p) {
		Session session = HibernateUtill.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
	}

	public static List<Person> getAllPersons() {
		Session session = HibernateUtill.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Person> list = new ArrayList<Person>();

		String SQL_QUERY = " from Person";

		Query query = session.createQuery(SQL_QUERY);

		list = query.list();
		transaction.commit();
		session.close();
		return list;
	}

	public static Person getPerson(int id) {
		Session session = HibernateUtill.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		String SQL_QUERY = " from Person where id=" + id;

		Query query = session.createQuery(SQL_QUERY);

		Person o = (Person) query.uniqueResult();
		transaction.commit();
		session.close();
		return o;
	}

	public static void updatePerson(Person p) {

		Session session = HibernateUtill.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.update(p);

		transaction.commit();
		session.close();

	}
	
	public static void deletePerson(Person p) {

		Session session = HibernateUtill.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(p);;

		transaction.commit();
		session.close();

	}
}
