package frameController;

import javax.swing.JOptionPane;

import controller.STipiSaveController;
import model.StokTipi;
import view.StokTipiView;

public class STipiSaveFrameController {
	
	private STipiSaveController sTipiSaveController;
	private StokTipiView stokTipiView;
	
	public STipiSaveFrameController(StokTipiView view) {
		this.sTipiSaveController = new STipiSaveController();
		this.stokTipiView = view;
		initController();
	}
	
	private void saveStokTipi() {
		String kodu = stokTipiView.getKodu().getText();
		String adi = stokTipiView.getAdi().getText();
		String aciklama = stokTipiView.getAciklama().getText();
		
		if(kodu.isEmpty() || adi.isEmpty() || aciklama.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lütfen tüm değerleri doldurunuz", null , JOptionPane.ERROR_MESSAGE);
		}else {
			StokTipi stokTipi = new StokTipi();
			stokTipi.setKodu(kodu);
			stokTipi.setAdi(adi);
			stokTipi.setAciklama(aciklama);
			
			sTipiSaveController.saveStokTipi(stokTipi);
			
			JOptionPane.showMessageDialog(null, "Kayıt başarılı");
			
			stokTipiView.getKodu().setText("");
			stokTipiView.getAdi().setText("");
			stokTipiView.getAciklama().setText("");
		}
	}
	private void initController() {
		stokTipiView.getEkleButton().addActionListener(e -> saveStokTipi());
	}

}
