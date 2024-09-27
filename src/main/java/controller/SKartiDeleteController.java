package controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.StokKarti;
import service.HibernateUtil;

public class SKartiDeleteController {

	public void deleteStokKarti(int id) {
		Transaction transaction = null;
		StokKarti stokKarti = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			stokKarti = session.get(StokKarti.class, id);
			session.delete(stokKarti);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
