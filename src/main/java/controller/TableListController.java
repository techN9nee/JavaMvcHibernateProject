package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.KdvTipi;
import model.StokKarti;
import model.StokTipi;
import service.HibernateUtil;

public class TableListController {

	public List<StokTipi> getStokTipi(){
		Transaction transaction = null;
		List<StokTipi> stokTipi = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			stokTipi = session.createQuery("from StokTipi").list();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return stokTipi;
	}
	
	public List<KdvTipi> getKdvTipi(){
		Transaction transaction = null;
		List<KdvTipi> kdvTipi = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			kdvTipi = session.createQuery("from KdvTipi").list();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return kdvTipi;
	}
	
	public List<StokKarti> getStokKarti(){
		Transaction transaction = null;
		List<StokKarti> stokKarti = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			stokKarti = session.createQuery("from StokKarti").list();
			transaction.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return stokKarti;
	}
}
