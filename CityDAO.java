package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.CityVO;
import vo.CountryVO;
import vo.StateVO;

public class CityDAO {

	public List loadCountry(CountryVO countryVO) {
		// TODO Auto-generated method stub
		List ls = null;

		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from CountryVO");
			ls = q.list();
			System.out.println("dao country size : >> " + ls.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls;
	}

	public List loadState(StateVO stateVO) {
		// TODO Auto-generated method stub
		List ls1 = null;

		try {
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from StateVO");
			ls1 = q.list();
			System.out.println("dao state size : >> " + ls1.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ls1;
	}

	public List searchCity(CityVO vo)

	{
		List lic = new ArrayList();
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("from CityVO");

			lic = q.list();
			tr.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lic;
	}

	public List loadCity(CityVO vo)

	{
			
		List li = new ArrayList();
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			Query q = session.createQuery("from CityVO where cityId = '"+vo.getCityId()+"'");

			li = q.list();
			tr.commit();
			session.flush();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

	public void insertCity(CityVO cityVO) {
		try {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(cityVO);
			tr.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteCity(CityVO cityVO) {
		try {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(cityVO);
			tr.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateCity(CityVO cityVO) {
		try {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.update(cityVO);
			tr.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
