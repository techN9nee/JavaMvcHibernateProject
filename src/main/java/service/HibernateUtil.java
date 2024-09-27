package service;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import model.KdvTipi;
import model.StokKarti;
import model.StokTipi;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		try {
			if(sessionFactory == null) {
				Configuration configuration = new Configuration();
				Properties properties = new Properties();
				
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/mvc_hibernate");
				properties.put(Environment.USER,"root");
				properties.put(Environment.PASS, "");
				properties.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(properties);
				configuration.addAnnotatedClass(StokTipi.class);
				configuration.addAnnotatedClass(KdvTipi.class);
				configuration.addAnnotatedClass(StokKarti.class);
				sessionFactory = configuration.buildSessionFactory();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sessionFactory;
	}
}


