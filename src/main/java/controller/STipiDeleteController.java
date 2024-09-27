package controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.StokTipi;
import service.HibernateUtil;

public class STipiDeleteController {

	public void deleteStokTipi(int id) {
		Transaction transaction = null;
		StokTipi stokTipi = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			stokTipi = session.get(StokTipi.class, id);
			session.delete(stokTipi);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
