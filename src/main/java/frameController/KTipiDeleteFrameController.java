package frameController;

import javax.swing.JOptionPane;

import controller.KTipiDeleteController;
import controller.TableListController;
import view.StokKartiListesiView;

public class KTipiDeleteFrameController {

	private KTipiDeleteController kTipiDeleteController;
	private StokKartiListesiView stokKartiListesiView;
	private KTipiTabloFrameController kTipiTabloFrameController;

	public KTipiDeleteFrameController(StokKartiListesiView view) {
		this.kTipiDeleteController = new KTipiDeleteController();
		this.stokKartiListesiView = view;
		this.kTipiTabloFrameController = new KTipiTabloFrameController(view);
		initController();
	}

	private void deleteKdvTipiTable() {
		int selectedRow = stokKartiListesiView.getTblKdvTipi().getSelectedRow();
		if (selectedRow != -1) {
			int id = (int) stokKartiListesiView.getTblKdvTipi().getValueAt(selectedRow, 0);
			kTipiDeleteController.deleteKdvTipi(id);
			JOptionPane.showMessageDialog(null, "Silme işlemi başarılı");
			kTipiTabloFrameController.openKdvTipiTable();
		} else {
			JOptionPane.showMessageDialog(null, "Silinecek satır seçiniz", null, JOptionPane.ERROR_MESSAGE);
		}
	}

	private void initController() {
		stokKartiListesiView.getBtnKdvTipiSil().addActionListener(e -> deleteKdvTipiTable());
	}
}
