package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.KdvTipi;
import service.HibernateUtil;

public class KTipiDeleteController {
	
	public void deleteKdvTipi(int id){
		Transaction transaction = null;
		KdvTipi kdvTipi = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			kdvTipi = session.get(KdvTipi.class, id);
			session.delete(kdvTipi);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
