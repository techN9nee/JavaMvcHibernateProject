package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.StokKarti;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import service.HibernateUtil;

public class PdfAcController {

	public void jasperConnector() {
		Transaction transaction = null;
		List<StokKarti> stokKarti = null ;
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			stokKarti = session.createQuery("from StokKarti",StokKarti.class).list();
			transaction.commit();
			
			List<Map<String,?>> cikti = new ArrayList<>();
			for(StokKarti stokKart : stokKarti) {
				Map<String, Object> row = new HashMap<>();
				row.put("id", stokKart.getId());
				row.put("stok_kodu", stokKart.getStokKodu());
				row.put("kdv_kodu", stokKart.getKdvKodu());
				row.put("stok_adi", stokKart.getStokAdi());
				row.put("kdv_adi", stokKart.getKdvAdi());
				row.put("orani", stokKart.getOrani());
				cikti.add(row);
			}
			String file = "C:\\Users\\aytek\\JaspersoftWorkspace\\MyReports\\mvc_hibernate.jasper";
			JRMapCollectionDataSource dataSource = new JRMapCollectionDataSource(cikti);
			JasperReport jReport = (JasperReport) JRLoader.loadObjectFromFile(file);
			JasperPrint jPrint = JasperFillManager.fillReport(jReport, null , dataSource);
			JasperViewer.viewReport(jPrint,false);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
