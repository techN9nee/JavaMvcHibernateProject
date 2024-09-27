package frameController;

import javax.swing.JOptionPane;

import controller.SKartiDeleteController;
import view.StokKartiListesiView;

public class SKartiDeleteFrameController {

	private SKartiDeleteController sKartiDeleteController;
	private StokKartiListesiView stokKartiListesiView;
	private SKartiTabloFrameController sKartiTabloFrameController;
	private STipiTabloFrameController sTipiTabloFrameController;
	private KTipiTabloFrameController kTipiTabloFrameController;
	public SKartiDeleteFrameController(StokKartiListesiView view) {
		this.sKartiDeleteController = new SKartiDeleteController();
		this.stokKartiListesiView = view ;
		this.sKartiTabloFrameController = new SKartiTabloFrameController(view);
		initController();
	}
	
	private void deleteStokKarti() {
		int selectedRow = stokKartiListesiView.getTblStokKarti().getSelectedRow();
		if( selectedRow != -1 ) {
			int id = (int) stokKartiListesiView.getTblStokKarti().getValueAt(selectedRow, 0);
			sKartiDeleteController.deleteStokKarti(id);
			JOptionPane.showMessageDialog(null, "Silme işlemi başarılıdır");
			sKartiTabloFrameController.openStokKartiTable();
		}else {
			JOptionPane.showMessageDialog(null, "Silinecek satır seçiniz",null , JOptionPane.ERROR_MESSAGE);
		}
	}
	private void initController() {
		stokKartiListesiView.getBtnStokKartiSil().addActionListener(e -> deleteStokKarti());
	}
}
