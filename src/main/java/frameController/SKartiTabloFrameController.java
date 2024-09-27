package frameController;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import controller.TableListController;
import model.StokKarti;
import view.StokKartiListesiView;

public class SKartiTabloFrameController {

	private TableListController tableListController;
	private StokKartiListesiView stokKartiListesiView;
	
	public SKartiTabloFrameController(StokKartiListesiView view) {
		this.tableListController = new TableListController();
		this.stokKartiListesiView = view;
		initController();
	}
	
	public void openStokKartiTable() {
		DefaultTableModel model1 = (DefaultTableModel) stokKartiListesiView.getTblStokKarti().getModel();
		model1.setRowCount(0);
		List<StokKarti> stokKarti = tableListController.getStokKarti();
		for(StokKarti stokKart : stokKarti) {
			Object[] row = {
				stokKart.getId(),
				stokKart.getStokKodu(),
				stokKart.getKdvKodu(),
				stokKart.getStokAdi(),
				stokKart.getKdvAdi(),
				stokKart.getOrani(),
			};
			model1.addRow(row);
		}
	}
	private void initController() {
		openStokKartiTable();
	}
}
