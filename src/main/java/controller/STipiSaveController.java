package controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.StokTipi;
import service.HibernateUtil;

public class STipiSaveController {
	public void saveStokTipi(StokTipi stokTipi) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(stokTipi);
			transaction.commit();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
