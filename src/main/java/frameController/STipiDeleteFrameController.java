package frameController;

import javax.swing.JOptionPane;

import controller.STipiDeleteController;
import controller.TableListController;
import view.StokKartiListesiView;

public class STipiDeleteFrameController {
	
	private STipiDeleteController sTipiDeleteController;
	private StokKartiListesiView stokKartiListesiView;
	private STipiTabloFrameController sTipiTabloFrameController;
	
	public STipiDeleteFrameController(StokKartiListesiView view) {
		this.sTipiDeleteController = new STipiDeleteController();
		this.sTipiTabloFrameController =  new STipiTabloFrameController(view);
		this.stokKartiListesiView = view;
		initController();
	}
	
	private void deleteStokTipi() {
		int selectedRow = stokKartiListesiView.getTblStokTipi().getSelectedRow();
		if(selectedRow != -1) {
			int id = (int) stokKartiListesiView.getTblStokTipi().getValueAt(selectedRow, 0);
			sTipiDeleteController.deleteStokTipi(id);
			sTipiTabloFrameController.openStokTipiTable();
			JOptionPane.showMessageDialog(null, "Silme işlemi başarılı");
		}else {
			JOptionPane.showMessageDialog(null, "Silinecek satırı seçiniz", null , JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void initController() {
		stokKartiListesiView.getBtnStokTipiSil().addActionListener(e -> deleteStokTipi());
	}

}
