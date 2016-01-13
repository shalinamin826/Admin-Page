package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.CountryVO;

public class CountryDAO {

	public void insertCountry(CountryVO vo) {

		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Insertring Record");
			session.save(vo);
			tr.commit();
			System.out.println("Done");
			session.flush();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteCountry(CountryVO vo) {

		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Deleting Record");
			session.delete(vo);
			tr.commit();
			System.out.println("Done");
			session.flush();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List searchCountry(CountryVO vo)

	{
		List li = new ArrayList();
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("from CountryVO");

			li = q.list();
			tr.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

	public void editCountry(CountryVO vo) {

		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Upadating Record");
			session.update(vo);
			tr.commit();
			System.out.println("Done");
			session.flush();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
