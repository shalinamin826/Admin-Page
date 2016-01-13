package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.CountryVO;
import vo.StateVO;

public class StateDAO {

	public List loadCountry(CountryVO countryVO) {
		// TODO Auto-generated method stub
		List ls =null;

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

	public void insertState(StateVO stateVO) {

		try {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(stateVO);
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List searchState(StateVO stateVO) {
		List li = null;
		try {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Searching");
			Query q = session.createQuery("from StateVO");
			li = q.list();

			tr.commit();
			System.out.println("Done" + li.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;

	}

	public void deleteState(StateVO stateVO) {
		// TODO Auto-generated method stub
		try {

			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Deleting Record");
			session.delete(stateVO);
			tr.commit();
			System.out.println("Done");
			session.flush();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List loadState(StateVO stateVO) {
		// TODO Auto-generated method stub
		List li = null;
		try {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Searching state");
			Query q = session.createQuery("from StateVO where stateId='"+stateVO.getStateId()+"'");
			li = q.list();
			System.out.println("dao stateList Done :: >  " + li.size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;

	}

	public void updateState(StateVO stateVO) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			SessionFactory sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			System.out.println("Updating state");
			session.update(stateVO);
			tr.commit();
			System.out.println("Updating Compelete");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
