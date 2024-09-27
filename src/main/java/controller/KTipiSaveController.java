package controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.KdvTipi;
import service.HibernateUtil;

public class KTipiSaveController {

	public void saveKdvTipi(KdvTipi kdvTipi) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(kdvTipi);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
