package controller;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.StokKarti;
import service.HibernateUtil;

public class SKartiSaveController {
	public void saveStokKarti(StokKarti stokKarti) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(stokKarti);
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
