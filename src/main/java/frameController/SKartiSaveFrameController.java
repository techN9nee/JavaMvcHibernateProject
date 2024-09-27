package frameController;

import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import controller.SKartiSaveController;
import controller.TableListController;
import model.KdvTipi;
import model.StokKarti;
import model.StokTipi;
import view.StokKartiView;

public class SKartiSaveFrameController {

	private SKartiSaveController sKartiSaveController;
	private TableListController tableListController;
	private StokKartiView stokKartiView;

	public SKartiSaveFrameController(StokKartiView view) {
		this.sKartiSaveController = new SKartiSaveController();
		this.tableListController = new TableListController();
		this.stokKartiView = view;
		initController();
	}

	private void cmbStokKodu(JComboBox cmb) {
		List<StokTipi> stokKodu = tableListController.getStokTipi();
		for (StokTipi stokKod : stokKodu) {
			cmb.addItem(stokKod.getKodu());
		}
	}

	private void cmbKdvKodu(JComboBox cmb) {
		List<KdvTipi> kdvKodu = tableListController.getKdvTipi();
		for (KdvTipi kdvKod : kdvKodu) {
			cmb.addItem(kdvKod.getKodu());
		}
	}

	private void cmbStokAdi(JComboBox cmb) {
		List<StokTipi> stokAdi = tableListController.getStokTipi();
		for (StokTipi stokAd : stokAdi) {
			cmb.addItem(stokAd.getAdi());
		}
	}

	private void cmbKdvAdi(JComboBox cmb) {
		List<KdvTipi> kdvAdi = tableListController.getKdvTipi();
		for (KdvTipi kdvAd : kdvAdi) {
			cmb.addItem(kdvAd.getAdi());
		}
	}

	private void cmbOrani(JComboBox cmb) {
		List<KdvTipi> orani = tableListController.getKdvTipi();
		for (KdvTipi oran : orani) {
			cmb.addItem(oran.getOrani());
		}
	}

	private void cmbBirles() {
		cmbStokKodu(stokKartiView.getCmbStokKodu());
		cmbKdvKodu(stokKartiView.getCmbKdvKodu());
		cmbStokAdi(stokKartiView.getCmbStokAdi());
		cmbKdvAdi(stokKartiView.getCmbKdvAdi());
		cmbOrani(stokKartiView.getCmbOrani());
	}

	private void saveStokKarti() {

		try {
			String stokKodu = stokKartiView.getCmbStokKodu().getSelectedItem().toString();
			String kdvKodu = stokKartiView.getCmbKdvKodu().getSelectedItem().toString();
			String stokAdi = stokKartiView.getCmbStokAdi().getSelectedItem().toString();
			String kdvAdi = stokKartiView.getCmbKdvAdi().getSelectedItem().toString();
			String oraniText = stokKartiView.getCmbOrani().getSelectedItem().toString();
			double orani = Double.parseDouble(oraniText);

			StokKarti stokKarti = new StokKarti();
			stokKarti.setStokKodu(stokKodu);
			stokKarti.setKdvKodu(kdvKodu);
			stokKarti.setStokAdi(stokAdi);
			stokKarti.setKdvAdi(kdvAdi);
			stokKarti.setOrani(orani);

			sKartiSaveController.saveStokKarti(stokKarti);

			JOptionPane.showMessageDialog(null, "Kayıt başarılı");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private void initController() {
		stokKartiView.getBtnStokKartiEkle().addActionListener(e -> saveStokKarti());
		cmbBirles();
	}

}
