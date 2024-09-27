package frameController;

import javax.swing.JOptionPane;

import controller.KTipiSaveController;
import model.KdvTipi;
import view.KdvTipiView;

public class KTipiSaveFrameController {

	private KTipiSaveController kTipiSaveController;
	private KdvTipiView kdvTipiView;

	public KTipiSaveFrameController(KdvTipiView view) {
		this.kTipiSaveController = new KTipiSaveController();
		this.kdvTipiView = view;
		initController();
	}

	private void saveKdvTipi() {
		String kodu = kdvTipiView.getKodu().getText();
		String adi = kdvTipiView.getAdi().getText();
		String oraniText = kdvTipiView.getOrani().getText();

		if (kodu.isEmpty() || adi.isEmpty() || oraniText.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lütfen tüm değerleri doldurunuz" , null , JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				double orani = Double.parseDouble(oraniText);
				KdvTipi kdvTipi = new KdvTipi();
				kdvTipi.setKodu(kodu);
				kdvTipi.setAdi(adi);
				kdvTipi.setOrani(orani);
				kTipiSaveController.saveKdvTipi(kdvTipi);

				JOptionPane.showMessageDialog(null, "Kayıt başarılı");

				kdvTipiView.getKodu().setText("");
				kdvTipiView.getAdi().setText("");
				kdvTipiView.getOrani().setText("");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Oran sayısal değer olmalıdır !", null, JOptionPane.ERROR_MESSAGE);
				kdvTipiView.getOrani().setText("");
			}

		}
	}
	private void initController() {
		kdvTipiView.getBtnEkle().addActionListener(e -> saveKdvTipi());
	}
}
